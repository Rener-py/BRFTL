
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rener.brftl.init;

import net.rener.brftl.item.TannedskinobjItem;
import net.rener.brftl.item.EdgercreaseritemItem;
import net.rener.brftl.BrftlMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BrftlModItems {
	public static Item LEATHER_TANNING_TABLEBL;
	public static Item EDGERCREASERITEM;
	public static Item TANNEDSKINOBJ;

	public static void load() {
		LEATHER_TANNING_TABLEBL = Registry.register(Registry.ITEM, new ResourceLocation(BrftlMod.MODID, "leather_tanning_tablebl"), new BlockItem(BrftlModBlocks.LEATHER_TANNING_TABLEBL, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
		EDGERCREASERITEM = Registry.register(Registry.ITEM, new ResourceLocation(BrftlMod.MODID, "edgercreaseritem"), new EdgercreaseritemItem());
		TANNEDSKINOBJ = Registry.register(Registry.ITEM, new ResourceLocation(BrftlMod.MODID, "tannedskinobj"), new TannedskinobjItem());
	}
}
