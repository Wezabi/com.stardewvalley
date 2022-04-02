package com.stardewvalley.farm;

import java.util.ArrayList;
import java.util.List;

import com.stardewvalley.crop.Crop;
import com.stardewvalley.crop.fertilizer.CropFertilizer;
import com.stardewvalley.crop.fertilizer.NoneCropFertilizer;
import com.stardewvalley.seed.Seed;

public class FarmPlot 
{
	private final Seed seed;
	private final int numberOfCrops;
	private final CropFertilizer cropFertilizer;
	
	
	public FarmPlot(Seed seed, int numberOfCrops)
	{
		this(seed, numberOfCrops, new NoneCropFertilizer());
	}
	
	public FarmPlot(Seed seed, int numberOfCrops, CropFertilizer cropFertilizer)
	{
		this.seed = seed;
		this.numberOfCrops = numberOfCrops;
		this.cropFertilizer = cropFertilizer;
	}
	
	public List<Crop> harvest(Farmer farmer)
	{
		List<Crop> crops = new ArrayList<>();
		for(int i = 0; i < numberOfCrops; i++)
		{
			crops.add(seed.harvest(farmer, cropFertilizer));
		}
		
		return crops;
	}
	
	public Seed getSeed()
	{
		return seed;
	}
	
	public int getPlotPrice()
	{
		return (seed.getPrice() + cropFertilizer.getPrice()) * numberOfCrops;
	}
	
	public int getNumberOfCrops()
	{
		return numberOfCrops;
	}
	
	public CropFertilizer getCropFertilizer()
	{
		return cropFertilizer;
	}
}
