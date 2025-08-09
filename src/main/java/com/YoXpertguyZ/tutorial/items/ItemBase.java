package com.YoXpertguyZ.tutorial.items;

import com.YoXpertguyZ.tutorial.Tutorial;
import net.minecraft.world.item.Item;


public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().tab(Tutorial.TAB));
    }
}
