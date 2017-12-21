package com.zeher.trzcore.production;

import com.zeher.trzcore.core.block.TRZBlockContainer;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TRZBlockFluidProducer extends TRZBlockContainer {
	
	public TRZBlockFluidProducer(String name, Material material, String tool, int harvest, int hardness, int resistance, CreativeTabs tab)  {
		super(tool, material, name, harvest, hardness, resistance, tab);
	}

	public TileEntity createNewTileEntity(World world, int arg1) {
		return null;
	}
}