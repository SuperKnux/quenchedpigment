package at.ski.quenchedpigment.block;

import at.petrak.hexcasting.common.blocks.BlockQuenchedAllay;
import at.petrak.hexcasting.common.particles.ConjureParticleOptions;
import at.ski.quenchedpigment.entity.BlockEntityQuenchedPigment;
import de.dafuqs.spectrum.api.block.ColorableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import static at.ski.quenchedpigment.QuenchedPigment.MOD_ID;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.*;


public class QuenchedPigmentBlock extends Block implements ColorableBlock, BlockEntityProvider {

    public static final int VARIANTS = 4;

    public final DyeColor color;

    private static final List<String> COLOR_STRINGS = List.of("light_blue", "light_gray", "white", "orange", "magenta", "yellow", "lime", "pink", "gray", "cyan", "purple", "blue", "brown", "green", "red", "black");

    public QuenchedPigmentBlock(Settings properties, DyeColor color) {
        super(properties);
        this.color = color;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    @Override
    public void randomDisplayTick(BlockState state, World level, BlockPos pos, Random rand) {
        ParticleEffect options = new ConjureParticleOptions(this.color.getId());
        Vec3d center = Vec3d.ofCenter(pos);
        for (Direction direction : Direction.values()) {
            int dX = direction.getOffsetX();
            int dY = direction.getOffsetY();
            int dZ = direction.getOffsetZ();

            int count = rand.nextInt(10) / 4;
            for (int i = 0; i < count; i++) {
                double pX = center.x + (dX == 0 ? MathHelper.nextDouble(rand, -0.5D, 0.5D) : (double) dX * 0.55D);
                double pY = center.y + (dY == 0 ? MathHelper.nextDouble(rand, -0.5D, 0.5D) : (double) dY * 0.55D);
                double pZ = center.z + (dZ == 0 ? MathHelper.nextDouble(rand, -0.5D, 0.5D) : (double) dZ * 0.55D);
                double vPerp = MathHelper.nextDouble(rand, 0.0, 0.01);
                double vX = vPerp * dX;
                double vY = vPerp * dY;
                double vZ = vPerp * dZ;
                level.addParticle(options, pX, pY, pZ, vX, vY, vZ);
            }
        }

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

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BlockEntityQuenchedPigment(this, pos, state);
    }
}
