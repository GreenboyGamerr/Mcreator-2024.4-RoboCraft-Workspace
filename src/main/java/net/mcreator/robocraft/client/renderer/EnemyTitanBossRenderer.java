
package net.mcreator.robocraft.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.robocraft.entity.model.EnemyTitanBossModel;
import net.mcreator.robocraft.entity.EnemyTitanBossEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EnemyTitanBossRenderer extends GeoEntityRenderer<EnemyTitanBossEntity> {
	public EnemyTitanBossRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EnemyTitanBossModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EnemyTitanBossEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, EnemyTitanBossEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(EnemyTitanBossEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
