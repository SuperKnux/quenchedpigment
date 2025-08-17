package at.ski.quenchedpigment.registry;

import at.ski.quenchedpigment.block.QuenchedPigmentBlock;
import de.dafuqs.fractal.api.ItemSubGroup;
import de.dafuqs.spectrum.helpers.ColorHelper;
import de.dafuqs.spectrum.registries.SpectrumItemGroups;
import de.dafuqs.spectrum.registries.SpectrumItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

import java.util.ArrayList;
import java.util.List;

import static at.ski.quenchedpigment.QuenchedPigment.locate;
import static de.dafuqs.spectrum.registries.SpectrumBlocks.registerBlockWithItem;

public class QuenchedPigmentBlocks {

    public static final List<PropertyHolder> items = new ArrayList<>();



    private static AbstractBlock.Settings settings(MapColor mapColor, BlockSoundGroup blockSoundGroup, float strength) {
        return FabricBlockSettings.create().mapColor(mapColor).sounds(blockSoundGroup).strength(strength);
    }

    private static AbstractBlock.Settings quenchedPigmentBlock(MapColor color) {
        return settings(color, BlockSoundGroup.AMETHYST_CLUSTER, 1.0f);
    }

    public static void registerBlockWithItem(ItemSubGroup subGroup, String name, Block block, FabricItemSettings itemSettings, DyeColor dyeColor) {
        Registry.register(Registries.BLOCK, locate(name), block);
        BlockItem blockItem = new BlockItem(block, itemSettings);
        Registry.register(Registries.ITEM, locate(name), blockItem);

        items.add(new PropertyHolder(block, blockItem, subGroup, dyeColor));
    }


    public static void register() {
        registerQuenchedPigmentBlocks(SpectrumItems.IS.of());
    };

    public static final QuenchedPigmentBlock QUENCHED_WHITE_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.WHITE);
    public static final QuenchedPigmentBlock QUENCHED_ORANGE_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.ORANGE);
    public static final QuenchedPigmentBlock QUENCHED_MAGENTA_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.MAGENTA);
    public static final QuenchedPigmentBlock QUENCHED_LIGHT_BLUE_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.LIGHT_BLUE);
    public static final QuenchedPigmentBlock QUENCHED_YELLOW_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.YELLOW);
    public static final QuenchedPigmentBlock QUENCHED_LIME_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.LIME);
    public static final QuenchedPigmentBlock QUENCHED_PINK_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.PINK);
    public static final QuenchedPigmentBlock QUENCHED_GRAY_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.GRAY);
    public static final QuenchedPigmentBlock QUENCHED_LIGHT_GRAY_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.LIGHT_GRAY);
    public static final QuenchedPigmentBlock QUENCHED_CYAN_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.CYAN);
    public static final QuenchedPigmentBlock QUENCHED_PURPLE_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.PURPLE);
    public static final QuenchedPigmentBlock QUENCHED_BLUE_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.BLUE);
    public static final QuenchedPigmentBlock QUENCHED_BROWN_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.BROWN);
    public static final QuenchedPigmentBlock QUENCHED_GREEN_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.GREEN);
    public static final QuenchedPigmentBlock QUENCHED_RED_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.RED);
    public static final QuenchedPigmentBlock QUENCHED_BLACK_BLOCK = new QuenchedPigmentBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(1.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK), DyeColor.BLACK);

    private static void registerQuenchedPigmentBlocks(FabricItemSettings settings) {

        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_white_block", QUENCHED_WHITE_BLOCK, new FabricItemSettings(), DyeColor.WHITE);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_orange_block", QUENCHED_ORANGE_BLOCK, new FabricItemSettings(), DyeColor.ORANGE);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_magenta_block", QUENCHED_MAGENTA_BLOCK, new FabricItemSettings(), DyeColor.MAGENTA);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_light_blue_block", QUENCHED_LIGHT_BLUE_BLOCK, new FabricItemSettings(), DyeColor.LIGHT_BLUE);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_yellow_block", QUENCHED_YELLOW_BLOCK, new FabricItemSettings(), DyeColor.YELLOW);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_lime_block", QUENCHED_LIME_BLOCK, new FabricItemSettings(), DyeColor.LIME);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_pink_block", QUENCHED_PINK_BLOCK, new FabricItemSettings(), DyeColor.PINK);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_gray_block", QUENCHED_GRAY_BLOCK, new FabricItemSettings(), DyeColor.GRAY);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_light_gray_block", QUENCHED_LIGHT_GRAY_BLOCK, new FabricItemSettings(), DyeColor.LIGHT_GRAY);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_cyan_block", QUENCHED_CYAN_BLOCK, new FabricItemSettings(), DyeColor.CYAN);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_purple_block", QUENCHED_PURPLE_BLOCK, new FabricItemSettings(), DyeColor.PURPLE);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_blue_block", QUENCHED_BLUE_BLOCK, new FabricItemSettings(), DyeColor.BLUE);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_brown_block", QUENCHED_BROWN_BLOCK, new FabricItemSettings(), DyeColor.BROWN);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_green_block", QUENCHED_GREEN_BLOCK, new FabricItemSettings(), DyeColor.GREEN);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_red_block", QUENCHED_RED_BLOCK, new FabricItemSettings(), DyeColor.RED);
        registerBlockWithItem(SpectrumItemGroups.DECORATION, "quenched_black_block", QUENCHED_BLACK_BLOCK, new FabricItemSettings(), DyeColor.BLACK);

    }

    public record PropertyHolder(Block block, Item item, ItemSubGroup subGroup, DyeColor color) {
    }

}
