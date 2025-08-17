package at.ski.quenchedpigment.block;

import at.petrak.hexcasting.common.blocks.BlockQuenchedAllay;
import de.dafuqs.spectrum.api.block.ColorableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import static at.ski.quenchedpigment.QuenchedPigment.MOD_ID;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.*;


public class QuenchedPigmentBlock extends BlockQuenchedAllay implements ColorableBlock {

    public final DyeColor color;

    private static final List<String> COLOR_STRINGS = List.of("light_blue", "light_gray", "white", "orange", "magenta", "yellow", "lime", "pink", "gray", "cyan", "purple", "blue", "brown", "green", "red", "black");

    public QuenchedPigmentBlock(Settings properties, DyeColor color) {
        super(properties);
        this.color = color;
    }

    @Override
    public boolean color(World world, BlockPos blockPos, DyeColor dyeColor) {
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        Identifier identifier = Registries.BLOCK.getId(block);

        String dyeColorColor = dyeColor.toString().toLowerCase();

        if (identifier.getPath().contains(dyeColorColor)) {
            return false;
        }

        QuenchedPigmentBlock newBlock = switch (dyeColor) {
            case LIGHT_BLUE -> QUENCHED_LIGHT_BLUE_BLOCK;
            case LIGHT_GRAY -> QUENCHED_LIGHT_GRAY_BLOCK;
            case WHITE -> QUENCHED_WHITE_BLOCK;
            case ORANGE -> QUENCHED_ORANGE_BLOCK;
            case MAGENTA -> QUENCHED_MAGENTA_BLOCK;
            case YELLOW -> QUENCHED_YELLOW_BLOCK;
            case LIME -> QUENCHED_LIME_BLOCK;
            case PINK -> QUENCHED_PINK_BLOCK;
            case GRAY -> QUENCHED_GRAY_BLOCK;
            case CYAN -> QUENCHED_CYAN_BLOCK;
            case PURPLE -> QUENCHED_PURPLE_BLOCK;
            case BLUE -> QUENCHED_BLUE_BLOCK;
            case BROWN -> QUENCHED_BROWN_BLOCK;
            case GREEN -> QUENCHED_GREEN_BLOCK;
            case RED -> QUENCHED_RED_BLOCK;
            case BLACK -> QUENCHED_BLACK_BLOCK;
            default -> throw new IllegalStateException("Unexpected value: " + dyeColor);
        };



        BlockState newState = newBlock.getDefaultState();

        world.setBlockState(blockPos, newState);
        return true;
    }

    @Override
    public DyeColor getColor(BlockState blockState) {
        return this.color;
    }
}
