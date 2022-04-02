package com.stardewvalley.seed;

import com.stardewvalley.crop.Cauliflower;
import com.stardewvalley.crop.Crop;
import com.stardewvalley.crop.fertilizer.CropFertilizer;
import com.stardewvalley.farm.Farmer;
import com.stardewvalley.logic.CropUtil;

public class CauliflowerSeed implements Seed
{
	@Override
	public String getSeedName()
	{
		return "Cauliflower";
	}
	
	@Override
	public Crop harvest(Farmer farmer, CropFertilizer fertilizer) 
	{
		return new Cauliflower(CropUtil.getCropQuality(farmer.getFarmingSkill(), fertilizer.getType()));
	}

	@Override
	public int getPrice() 
	{
		return 80;
	}
	
	@Override
	public int getGrowDays() 
	{
		return 12;
	}
}
