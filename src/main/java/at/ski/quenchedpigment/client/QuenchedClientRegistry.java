package at.ski.quenchedpigment.client;

import at.petrak.hexcasting.client.RegisterClientStuff;
import at.petrak.hexcasting.client.render.GaslightingTracker;
import at.petrak.hexcasting.client.render.be.BlockEntityQuenchedAllayRenderer;
import at.petrak.hexcasting.xplat.IClientXplatAbstractions;
import at.ski.quenchedpigment.block.QuenchedPigmentBlock;
import at.ski.quenchedpigment.entity.BlockEntityQuenchedPigment;
import at.ski.quenchedpigment.entity.BlockEntityQuenchedPigmentRenderer;
import at.ski.quenchedpigment.registry.QuenchedPigmentBlockEntities;
import at.ski.quenchedpigment.registry.QuenchedPigmentBlocks;
import de.dafuqs.spectrum.helpers.ColorHelper;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static at.petrak.hexcasting.api.HexAPI.modLoc;

public class QuenchedClientRegistry {


    public static Map<Identifier, List<BakedModel>> QUENCHED_PIGMENT_VARIANTS = new HashMap<>();
    private static final Map<QuenchedPigmentBlock, Boolean> QUENCHED_PIGMENT_TYPES = Map.ofEntries(
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_WHITE_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_ORANGE_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_MAGENTA_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_LIGHT_BLUE_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_YELLOW_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_LIME_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_PINK_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_GRAY_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_LIGHT_GRAY_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_CYAN_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_PURPLE_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_BLUE_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_BROWN_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_GREEN_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_RED_BLOCK, false),
            new AbstractMap.SimpleEntry<>(QuenchedPigmentBlocks.QUENCHED_BLACK_BLOCK, false)
    );

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
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_WHITE_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_ORANGE_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_MAGENTA_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_LIGHT_BLUE_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_YELLOW_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_LIME_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_PINK_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_GRAY_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_LIGHT_GRAY_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_CYAN_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_PURPLE_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_BLUE_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_BROWN_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_GREEN_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_RED_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);
        registerer.registerBlockEntityRenderer(QuenchedPigmentBlockEntities.QUENCHED_BLACK_PIGMENT_TILE, BlockEntityQuenchedPigmentRenderer::new);

    }

    @FunctionalInterface
    public interface BlockEntityRendererRegisterererer {
        <T extends BlockEntity> void registerBlockEntityRenderer(BlockEntityType<? extends T> type,
                                                                 BlockEntityRendererFactory<T> berp);
    }

    public static void onModelBake(ModelLoader loader, Map<Identifier, BakedModel> map) {
        for (var type : QUENCHED_PIGMENT_TYPES.entrySet()) {
            var blockLoc = Registries.BLOCK.getId(type.getKey());
            var locStart = "block/";
            if (type.getValue())
                locStart += "deco/";

            var list = new ArrayList<BakedModel>();
            for (int i = 0; i < QuenchedPigmentBlock.VARIANTS; i++) {
                var variantLoc = modLoc(locStart + blockLoc.getPath() + "_" + i);
                var model = map.get(variantLoc);
                list.add(model);
            }
            QUENCHED_PIGMENT_VARIANTS.put(blockLoc, list);
        }
    }
}
