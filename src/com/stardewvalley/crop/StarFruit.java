package com.stardewvalley.crop;

public class StarFruit implements Crop 
{
	private CropQuality quality;
	
	public StarFruit(CropQuality quality)
	{
		this.quality = quality;
	}

	@Override
	public CropType getCropType() 
	{
		return CropType.FRUIT;
	}

	@Override
	public CropQuality getQuality() 
	{
		return quality;
	}
	
	@Override
	public int getBasePrice() 
	{
		return 750;
	}
}
