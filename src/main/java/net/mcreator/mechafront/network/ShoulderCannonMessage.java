
package net.mcreator.mechafront.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.mechafront.procedures.ShuldercannonkeypressProcedure;
import net.mcreator.mechafront.procedures.ShoulderCannonOnKeyReleasedProcedure;
import net.mcreator.mechafront.MechafrontMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ShoulderCannonMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ShoulderCannonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MechafrontMod.MODID, "key_shoulder_cannon"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ShoulderCannonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ShoulderCannonMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ShoulderCannonMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ShoulderCannonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ShoulderCannonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			ShuldercannonkeypressProcedure.execute(world, entity);
		}
		if (type == 1) {

			ShoulderCannonOnKeyReleasedProcedure.execute();
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MechafrontMod.addNetworkMessage(ShoulderCannonMessage.TYPE, ShoulderCannonMessage.STREAM_CODEC, ShoulderCannonMessage::handleData);
	}
}
