package com.voiddev.VoidAdditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CryptoBlock extends Block {
    public CryptoBlock() {
        super(Properties
                .create(Material.METAL)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .setLightLevel(value -> 15)
        );
    }
}
