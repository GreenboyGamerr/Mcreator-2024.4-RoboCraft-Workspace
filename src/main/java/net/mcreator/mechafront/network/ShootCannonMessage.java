
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

import net.mcreator.mechafront.procedures.ShootCannonOnKeyReleasedProcedure;
import net.mcreator.mechafront.procedures.ShootCannonOnKeyPressedProcedure;
import net.mcreator.mechafront.MechafrontMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ShootCannonMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ShootCannonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MechafrontMod.MODID, "key_shoot_cannon"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ShootCannonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ShootCannonMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ShootCannonMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ShootCannonMessage> type() {
		return TYPE;
	}

	public static void handleData(final ShootCannonMessage message, final IPayloadContext context) {
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

			ShootCannonOnKeyPressedProcedure.execute(world, entity);
		}
		if (type == 1) {

			ShootCannonOnKeyReleasedProcedure.execute();
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MechafrontMod.addNetworkMessage(ShootCannonMessage.TYPE, ShootCannonMessage.STREAM_CODEC, ShootCannonMessage::handleData);
	}
}
