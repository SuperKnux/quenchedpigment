package at.ski.quenchedpigment.registry;

import at.petrak.hexcasting.common.blocks.entity.BlockEntityQuenchedAllay;
import at.petrak.hexcasting.xplat.IXplatAbstractions;
import at.ski.quenchedpigment.QuenchedPigment;
import at.ski.quenchedpigment.block.QuenchedPigmentBlock;
import at.ski.quenchedpigment.entity.BlockEntityQuenchedPigment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.*;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_BLACK_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_BLUE_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_BROWN_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_CYAN_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_GRAY_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_GREEN_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_LIME_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_MAGENTA_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_ORANGE_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_PINK_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_PURPLE_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_RED_BLOCK;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_YELLOW_BLOCK;

public class QuenchedPigmentBlockEntities  {

    public static void registerTiles(BiConsumer<BlockEntityType<?>, Identifier> r) {
        for (var e : BLOCK_ENTITIES.entrySet()) {
            r.accept(e.getValue(), e.getKey());
        }
    }

    private static final Map<Identifier, BlockEntityType<?>> BLOCK_ENTITIES = new LinkedHashMap<>();

    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_WHITE_PIGMENT_TILE = register("quenched_white_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_WHITE_BLOCK), QuenchedPigmentBlocks.QUENCHED_WHITE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_ORANGE_PIGMENT_TILE = register("quenched_orange_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_ORANGE_BLOCK), QuenchedPigmentBlocks.QUENCHED_ORANGE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_MAGENTA_PIGMENT_TILE = register("quenched_magenta_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_MAGENTA_BLOCK), QuenchedPigmentBlocks.QUENCHED_MAGENTA_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_LIGHT_BLUE_PIGMENT_TILE = register("quenched_light_blue_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_LIGHT_BLUE_BLOCK), QuenchedPigmentBlocks.QUENCHED_LIGHT_BLUE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_YELLOW_PIGMENT_TILE = register("quenched_yellow_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_YELLOW_BLOCK), QuenchedPigmentBlocks.QUENCHED_YELLOW_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_LIME_PIGMENT_TILE = register("quenched_lime_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_LIME_BLOCK), QuenchedPigmentBlocks.QUENCHED_LIME_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_PINK_PIGMENT_TILE = register("quenched_pink_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_PINK_BLOCK), QuenchedPigmentBlocks.QUENCHED_PINK_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_GRAY_PIGMENT_TILE = register("quenched_gray_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_GRAY_BLOCK), QuenchedPigmentBlocks.QUENCHED_GRAY_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_LIGHT_GRAY_PIGMENT_TILE = register("quenched_light_gray_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_LIGHT_GRAY_BLOCK), QuenchedPigmentBlocks.QUENCHED_LIGHT_GRAY_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_CYAN_PIGMENT_TILE = register("quenched_cyan_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_CYAN_BLOCK), QuenchedPigmentBlocks.QUENCHED_CYAN_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_PURPLE_PIGMENT_TILE = register("quenched_purple_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_PURPLE_BLOCK), QuenchedPigmentBlocks.QUENCHED_PURPLE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_BLUE_PIGMENT_TILE = register("quenched_blue_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_BLUE_BLOCK), QuenchedPigmentBlocks.QUENCHED_BLUE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_BROWN_PIGMENT_TILE = register("quenched_brown_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_BROWN_BLOCK), QuenchedPigmentBlocks.QUENCHED_BROWN_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_GREEN_PIGMENT_TILE = register("quenched_green_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_GREEN_BLOCK), QuenchedPigmentBlocks.QUENCHED_GREEN_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_RED_PIGMENT_TILE = register("quenched_red_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_RED_BLOCK), QuenchedPigmentBlocks.QUENCHED_RED_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedPigment> QUENCHED_BLACK_PIGMENT_TILE = register("quenched_black_pigment", BlockEntityQuenchedPigment.pigmentKnownBlock(QuenchedPigmentBlocks.QUENCHED_BLACK_BLOCK), QuenchedPigmentBlocks.QUENCHED_BLACK_BLOCK);


    private static <T extends BlockEntity> BlockEntityType<T> register(String id, BiFunction<BlockPos, BlockState, T> func, Block... blocks) {

        var ret = IXplatAbstractions.INSTANCE.createBlockEntityType(func, blocks);
        var old = BLOCK_ENTITIES.put(Identifier.of(QuenchedPigment.MOD_ID, id), ret);
        if (old != null) {
            throw new IllegalArgumentException("Duplicate id " + id);
        }
        return ret;
    }

    public static BlockEntityType<BlockEntityQuenchedPigment> typeForQuenchedAllay(QuenchedPigmentBlock block) {
        if (block == QUENCHED_WHITE_BLOCK)
            return QUENCHED_WHITE_PIGMENT_TILE;
        if (block == QUENCHED_ORANGE_BLOCK)
            return QUENCHED_ORANGE_PIGMENT_TILE;
        if (block == QUENCHED_MAGENTA_BLOCK)
            return QUENCHED_MAGENTA_PIGMENT_TILE;
        if (block == QUENCHED_LIGHT_BLUE_BLOCK)
            return QUENCHED_LIGHT_BLUE_PIGMENT_TILE;
        if (block == QUENCHED_YELLOW_BLOCK)
            return QUENCHED_YELLOW_PIGMENT_TILE;
        if (block == QUENCHED_LIME_BLOCK)
            return QUENCHED_LIME_PIGMENT_TILE;
        if (block == QUENCHED_PINK_BLOCK)
            return QUENCHED_PINK_PIGMENT_TILE;
        if (block == QUENCHED_GRAY_BLOCK)
            return QUENCHED_GRAY_PIGMENT_TILE;
        if (block == QUENCHED_LIGHT_GRAY_BLOCK)
            return QUENCHED_LIGHT_GRAY_PIGMENT_TILE;
        if (block == QUENCHED_CYAN_BLOCK)
            return QUENCHED_CYAN_PIGMENT_TILE;
        if (block == QUENCHED_PURPLE_BLOCK)
            return QUENCHED_PURPLE_PIGMENT_TILE;
        if (block == QUENCHED_BLUE_BLOCK)
            return QUENCHED_BLUE_PIGMENT_TILE;
        if (block == QUENCHED_BROWN_BLOCK)
            return QUENCHED_BROWN_PIGMENT_TILE;
        if (block == QUENCHED_GREEN_BLOCK)
            return QUENCHED_GREEN_PIGMENT_TILE;
        if (block == QUENCHED_RED_BLOCK)
            return QUENCHED_RED_PIGMENT_TILE;
        if (block == QUENCHED_BLACK_BLOCK)
            return QUENCHED_BLACK_PIGMENT_TILE;
        return null;
    }
}
