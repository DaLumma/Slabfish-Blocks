package com.evoslab.slabfishblocks.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.enchantment.IArmorVanishable;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

public class SlabfishBlock extends HorizontalBlock implements IArmorVanishable {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public SlabfishBlock(AbstractBlock.Properties builder) {
        super(builder);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
