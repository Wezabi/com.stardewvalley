package com.stardewvalley.logic;

import java.util.Collection;

import com.stardewvalley.crop.Crop;

public class CropCalculator 
{
	private final Collection<Crop> crops;
	
	public CropCalculator(Collection<Crop> crops)
	{
		this.crops = crops;
	}
	
	public int calculateSell()
	{
		double totalMoney = 0;
		for(Crop crop : crops)
		{
			totalMoney = (totalMoney + (crop.getBasePrice() * CropUtil.convertQualityToMultipler(crop.getQuality())));
		}
		
		return (int) totalMoney;
	}
	
	public void printCropQualityValues()
	{
		int normalCrops = 0;
		int silverCrops = 0;
		int goldCrops = 0;
		int iridiumCrops = 0;
		for(Crop crop: crops)
		{
			switch(crop.getQuality())
			{
			
			case NORMAL:
				normalCrops++;
				break;
			case SILVER:
				silverCrops++;
				break;
			case GOLD:
				goldCrops++;
				break;
			case IRIDIUM:
				iridiumCrops++;
				break;
			}
		}
		
    	System.out.println("Normal crops: " + normalCrops);
    	System.out.println("Silver crops: " + silverCrops);
    	System.out.println("Gold crops: " + goldCrops);
    	System.out.println("Iridium crops: " + iridiumCrops);
	}
	
	public int calculateProfit()
	{
		double totalMoney = 0;
		for(Crop crop : crops)
		{
			totalMoney = (totalMoney + (crop.getBasePrice() * CropUtil.convertQualityToMultipler(crop.getQuality())));
		}
		
		return (int) totalMoney;
	}
}
