package com.stardewvalley.crop;

public class Cauliflower implements Crop 
{
	private CropQuality quality;
	
	public Cauliflower(CropQuality quality)
	{
		this.quality = quality;
	}

	@Override
	public CropType getCropType() 
	{
		return CropType.VEGITABLE;
	}

	@Override
	public CropQuality getQuality() 
	{
		return quality;
	}

	@Override
	public int getBasePrice() 
	{
		return 175;
	}
}
