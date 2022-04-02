package com.stardewvalley.crop.fertilizer;

public class DeluxeCropFertilizer implements CropFertilizer {

	@Override
	public CropFertilizerType getType() 
	{
		return CropFertilizerType.DELUXE;
	}

	@Override
	public int getPrice() 
	{
		return 140;
	}

}
