package net.mcreator.robocraft.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.mcreator.robocraft.RobocraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RobocraftModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, RobocraftMod.MODID);
	public static double fight = 0;
	public static double flight = 0;
	public static double X = 0;
	public static double Y = 0;
	public static double Z = 0;
	public static double flight2 = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
