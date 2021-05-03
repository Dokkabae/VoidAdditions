package com.voiddev.VoidAdditions.blocks;

import com.voiddev.VoidAdditions.VoidAdditions;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) { super(block, new Properties().group(VoidAdditions.TAB));
    }
}
