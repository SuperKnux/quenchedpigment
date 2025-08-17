package at.ski.quenchedpigment.client;

import at.petrak.hexcasting.client.RegisterClientStuff;
import at.petrak.hexcasting.client.render.GaslightingTracker;
import at.petrak.hexcasting.client.render.be.BlockEntityQuenchedAllayRenderer;
import at.petrak.hexcasting.xplat.IClientXplatAbstractions;
import at.ski.quenchedpigment.registry.QuenchedPigmentBlockEntities;
import at.ski.quenchedpigment.registry.QuenchedPigmentBlocks;
import de.dafuqs.spectrum.helpers.ColorHelper;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import org.jetbrains.annotations.NotNull;

public class QuenchedClientRegistry {
    public static void init() {
        var x = IClientXplatAbstractions.INSTANCE;
        for (QuenchedPigmentBlocks.PropertyHolder item : QuenchedPigmentBlocks.items) {
            registerGaslight4(item.item());
        }







    }

    private static void registerGaslight4(Item item)
    {
        IClientXplatAbstractions.INSTANCE.registerItemProperty(item,
        GaslightingTracker.GASLIGHTING_PRED, (stack, level, holder, holderID) ->
        Math.abs(GaslightingTracker.getGaslightingAmount() % 4));
    }

    public static void registerBlockEntityRenderers(@NotNull BlockEntityRendererRegisterererer registerer) {
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_WHITE_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_ORANGE_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_MAGENTA_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_LIGHT_BLUE_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_YELLOW_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_LIME_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_PINK_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_GRAY_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_LIGHT_GRAY_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_CYAN_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_PURPLE_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_BLUE_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_BROWN_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_GREEN_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_RED_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_BLACK_PIGMENT_TILE, BlockEntityQuenchedAllayRenderer::new);

    }

    @FunctionalInterface
    public interface BlockEntityRendererRegisterererer {
        <T extends BlockEntity> void registerBlockEntityRenderer(BlockEntityType<T> type,
                                                                 BlockEntityRendererFactory<? super T> berp);
    }




}
