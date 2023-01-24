package net.kyrptonaught.glassdoor;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class BlockGlassTrapDoor extends TrapdoorBlock {
	protected BlockGlassTrapDoor(Settings settings, String name) {
		super(settings, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN);
		Registry.register(Registries.BLOCK, new Identifier(GlassDoorMod.MOD_ID, name), this);
		Registry.register(Registries.ITEM, new Identifier(GlassDoorMod.MOD_ID, name), new BlockItem(this, new Item.Settings()));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.add(this));
	}
}
