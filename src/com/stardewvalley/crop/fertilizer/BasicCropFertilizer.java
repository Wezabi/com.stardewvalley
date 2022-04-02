package com.stardewvalley.crop.fertilizer;

public class BasicCropFertilizer implements CropFertilizer {

	@Override
	public CropFertilizerType getType() 
	{
		return CropFertilizerType.BASIC;
	}

	@Override
	public int getPrice() 
	{
		return 2;
	}
}
