package com.stardewvalley.crop;

public interface Crop 
{
	CropType getCropType();
	
	int getBasePrice();

	CropQuality getQuality();
}
