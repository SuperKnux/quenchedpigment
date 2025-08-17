package at.ski.quenchedpigment.entity;

import at.petrak.hexcasting.client.RegisterClientStuff;
import at.petrak.hexcasting.client.render.GaslightingTracker;
import at.ski.quenchedpigment.block.QuenchedPigmentBlock;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.Registries;

import static at.ski.quenchedpigment.client.QuenchedClientRegistry.QUENCHED_PIGMENT_VARIANTS;

public class BlockEntityQuenchedPigmentRenderer implements BlockEntityRenderer<BlockEntityQuenchedPigment> {

    private static void doRender(QuenchedPigmentBlock block, BlockRenderManager dispatcher, MatrixStack ps, VertexConsumerProvider bufSource,
                                 int packedLight, int packedOverlay) {
        var buffer = bufSource.getBuffer(RenderLayer.getTranslucent());
        var pose = ps.peek();

        var idx = Math.abs(GaslightingTracker.getGaslightingAmount() % QuenchedPigmentBlock.VARIANTS);
        var model = QUENCHED_PIGMENT_VARIANTS.get(Registries.BLOCK.getId(block)).get(idx);

        dispatcher.getModelRenderer().render(pose, buffer, null, model, 1f, 1f, 1f, packedLight, packedOverlay);
    }

    @Override
    public void render(BlockEntityQuenchedPigment entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

    }
}
