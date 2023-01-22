package net.kyrptonaught.glassdoor;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.DoorBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.TallBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;


public class BlockGlassDoor extends DoorBlock {

    BlockGlassDoor(Settings block$Settings_1, String name) {
        super(block$Settings_1, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN);
        Registry.register(Registries.BLOCK, new Identifier(GlassDoorMod.MOD_ID, name), this);
        Registry.register(Registries.ITEM, new Identifier(GlassDoorMod.MOD_ID, name), new TallBlockItem(this, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.add(this));
    }
}
