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

        String newBlock = switch (dyeColorColor) {
            case "light_blue" -> "quenched_light_blue_block";
            case "light_gray" -> "quenched_light_gray_block";
            case "white" -> "quenched_white_block";
            case "orange" -> "quenched_orange_block";
            case "magenta" -> "quenched_magenta_block";
            case "yellow" -> "quenched_yellow_block";
            case "lime" -> "quenched_lime_block";
            case "pink" -> "quenched_pink_block";
            case "gray" -> "quenched_gray_block";
            case "cyan" -> "quenched_cyan_block";
            case "purple" -> "quenched_purple_block";
            case "blue" -> "quenched_blue_block";
            case "brown" -> "quenched_brown_block";
            case "green" -> "quenched_green_block";
            case "red" -> "quenched_red_block";
            case "black" -> "quenched_black_block";
            default -> throw new IllegalStateException("Unexpected value: " + dyeColorColor);
        };

        BlockState newState = Registries.BLOCK.get(Identifier.of(MOD_ID, newBlock)).getDefaultState();

        world.setBlockState(blockPos, newState);
        return true;
    }

    @Override
    public DyeColor getColor(BlockState blockState) {
        return this.color;
    }
}
