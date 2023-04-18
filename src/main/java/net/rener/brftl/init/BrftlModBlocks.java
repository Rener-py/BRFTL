
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rener.brftl.init;

import net.rener.brftl.block.LeatherTanningTableblBlock;
import net.rener.brftl.BrftlMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BrftlModBlocks {
	public static Block LEATHER_TANNING_TABLEBL;

	public static void load() {
		LEATHER_TANNING_TABLEBL = Registry.register(Registry.BLOCK, new ResourceLocation(BrftlMod.MODID, "leather_tanning_tablebl"), new LeatherTanningTableblBlock());
	}

	public static void clientLoad() {
		LeatherTanningTableblBlock.clientInit();
	}
}
