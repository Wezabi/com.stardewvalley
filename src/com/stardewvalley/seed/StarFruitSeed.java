package com.stardewvalley.seed;

import com.stardewvalley.crop.Crop;
import com.stardewvalley.crop.StarFruit;
import com.stardewvalley.crop.fertilizer.CropFertilizer;
import com.stardewvalley.farm.Farmer;
import com.stardewvalley.logic.CropUtil;

public class StarFruitSeed implements Seed
{
	@Override
	public String getSeedName() 
	{
		return "Star Fruit";
	}
	
	@Override
	public Crop harvest(Farmer farmer, CropFertilizer fertilizer) 
	{
		return new StarFruit(CropUtil.getCropQuality(farmer.getFarmingSkill(), fertilizer.getType()));
	}

	@Override
	public int getPrice() 
	{
		return 400;
	}
	
	@Override
	public int getGrowDays() 
	{
		return 13;
	}
}
