package com.stardewvalley.crop.fertilizer;

public class QualityCropFertilizer implements CropFertilizer {

	@Override
	public CropFertilizerType getType() 
	{
		return CropFertilizerType.QUALITY;
	}

	@Override
	public int getPrice() 
	{
		return 10;
	}
}
