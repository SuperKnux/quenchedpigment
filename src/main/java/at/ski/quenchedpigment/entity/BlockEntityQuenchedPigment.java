package at.ski.quenchedpigment.entity;

import at.petrak.hexcasting.api.block.HexBlockEntity;
import at.petrak.hexcasting.common.blocks.BlockQuenchedAllay;
import at.petrak.hexcasting.common.blocks.entity.BlockEntityQuenchedAllay;
import at.ski.quenchedpigment.block.QuenchedPigmentBlock;
import at.ski.quenchedpigment.registry.QuenchedPigmentBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

import java.util.function.BiFunction;

public class BlockEntityQuenchedPigment extends HexBlockEntity {

    public BlockEntityQuenchedPigment(QuenchedPigmentBlock block, BlockPos pos, BlockState blockState) {
        super(QuenchedPigmentBlockEntities.typeForQuenchedAllay(block), pos, blockState);
    }

    public static BiFunction<BlockPos, BlockState, BlockEntityQuenchedPigment> pigmentKnownBlock(QuenchedPigmentBlock    block) {
        return (pos, state) -> new BlockEntityQuenchedPigment(block, pos, state);
    }

    @Override
    protected void saveModData(NbtCompound nbtCompound) {

    }

    @Override
    protected void loadModData(NbtCompound nbtCompound) {

    }
}
