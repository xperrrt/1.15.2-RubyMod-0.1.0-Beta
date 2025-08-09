package com.YoXpertguyZ.tutorial.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RubyBlock extends Block {
    public RubyBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops());
    }
}
