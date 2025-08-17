package at.ski.quenchedpigment.registry;

import at.petrak.hexcasting.common.blocks.entity.BlockEntityQuenchedAllay;
import at.petrak.hexcasting.xplat.IXplatAbstractions;
import at.ski.quenchedpigment.QuenchedPigment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class QuenchedPigmentBlockEntities  {

    private static final Map<Identifier, BlockEntityType<?>> BLOCK_ENTITIES = new LinkedHashMap<>();

    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_WHITE_PIGMENT_TILE = register("quenched_white_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_WHITE_BLOCK), QuenchedPigmentBlocks.QUENCHED_WHITE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_ORANGE_PIGMENT_TILE = register("quenched_orange_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_ORANGE_BLOCK), QuenchedPigmentBlocks.QUENCHED_ORANGE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_MAGENTA_PIGMENT_TILE = register("quenched_magenta_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_MAGENTA_BLOCK), QuenchedPigmentBlocks.QUENCHED_MAGENTA_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_LIGHT_BLUE_PIGMENT_TILE = register("quenched_light_blue_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_LIGHT_BLUE_BLOCK), QuenchedPigmentBlocks.QUENCHED_LIGHT_BLUE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_YELLOW_PIGMENT_TILE = register("quenched_yellow_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_YELLOW_BLOCK), QuenchedPigmentBlocks.QUENCHED_YELLOW_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_LIME_PIGMENT_TILE = register("quenched_lime_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_LIME_BLOCK), QuenchedPigmentBlocks.QUENCHED_LIME_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_PINK_PIGMENT_TILE = register("quenched_pink_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_PINK_BLOCK), QuenchedPigmentBlocks.QUENCHED_PINK_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_GRAY_PIGMENT_TILE = register("quenched_gray_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_GRAY_BLOCK), QuenchedPigmentBlocks.QUENCHED_GRAY_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_LIGHT_GRAY_PIGMENT_TILE = register("quenched_light_gray_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_LIGHT_GRAY_BLOCK), QuenchedPigmentBlocks.QUENCHED_LIGHT_GRAY_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_CYAN_PIGMENT_TILE = register("quenched_cyan_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_CYAN_BLOCK), QuenchedPigmentBlocks.QUENCHED_CYAN_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_PURPLE_PIGMENT_TILE = register("quenched_purple_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_PURPLE_BLOCK), QuenchedPigmentBlocks.QUENCHED_PURPLE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_BLUE_PIGMENT_TILE = register("quenched_blue_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_BLUE_BLOCK), QuenchedPigmentBlocks.QUENCHED_BLUE_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_BROWN_PIGMENT_TILE = register("quenched_brown_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_BROWN_BLOCK), QuenchedPigmentBlocks.QUENCHED_BROWN_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_GREEN_PIGMENT_TILE = register("quenched_green_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_GREEN_BLOCK), QuenchedPigmentBlocks.QUENCHED_GREEN_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_RED_PIGMENT_TILE = register("quenched_red_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_RED_BLOCK), QuenchedPigmentBlocks.QUENCHED_RED_BLOCK);
    public static final BlockEntityType<BlockEntityQuenchedAllay> QUENCHED_BLACK_PIGMENT_TILE = register("quenched_black_pigment", BlockEntityQuenchedAllay.fromKnownBlock(QuenchedPigmentBlocks.QUENCHED_BLACK_BLOCK), QuenchedPigmentBlocks.QUENCHED_BLACK_BLOCK);


    private static <T extends BlockEntity> BlockEntityType<T> register(String id, BiFunction<BlockPos, BlockState, T> func, Block... blocks) {

        var ret = IXplatAbstractions.INSTANCE.createBlockEntityType(func, blocks);
        var old = BLOCK_ENTITIES.put(Identifier.of(QuenchedPigment.MOD_ID, id), ret);
        if (old != null) {
            throw new IllegalArgumentException("Duplicate id " + id);
        }
        return ret;
    }
}
