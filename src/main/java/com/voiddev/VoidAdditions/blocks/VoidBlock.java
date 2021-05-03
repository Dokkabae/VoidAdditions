package com.voiddev.VoidAdditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class VoidBlock extends Block {
    public VoidBlock() {
        super(Properties
                .create(Material.ICE)
                .hardnessAndResistance(10.0f, 20.0f)
                .sound(SoundType.GLASS)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .setLightLevel(value -> 15));
    }
}