package com.stardewvalley.crop.fertilizer;

public class NoneCropFertilizer implements CropFertilizer {

	@Override
	public CropFertilizerType getType() 
	{
		return CropFertilizerType.NONE;
	}

	@Override
	public int getPrice() 
	{
		return 0;
	}
}
