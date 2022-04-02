package com.stardewvalley.seed;

import com.stardewvalley.crop.Crop;
import com.stardewvalley.crop.fertilizer.CropFertilizer;
import com.stardewvalley.farm.Farmer;

public interface Seed 
{
	String getSeedName();
	
	Crop harvest(Farmer farmer, CropFertilizer fertilizer);
	
	int getPrice();
	
	int getGrowDays();
}
