
package net.mcreator.robocraft.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.robocraft.entity.model.EnemyTitanPhase3Model;
import net.mcreator.robocraft.entity.EnemyTitanPhase3Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EnemyTitanPhase3Renderer extends GeoEntityRenderer<EnemyTitanPhase3Entity> {
	public EnemyTitanPhase3Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EnemyTitanPhase3Model());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EnemyTitanPhase3Entity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, EnemyTitanPhase3Entity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(EnemyTitanPhase3Entity entityLivingBaseIn) {
		return 0.0F;
	}
}
