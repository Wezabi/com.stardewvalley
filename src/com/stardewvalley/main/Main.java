package com.stardewvalley.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.stardewvalley.crop.Crop;
import com.stardewvalley.crop.fertilizer.CropFertilizer;
import com.stardewvalley.crop.fertilizer.DeluxeCropFertilizer;
import com.stardewvalley.crop.fertilizer.QualityCropFertilizer;
import com.stardewvalley.farm.DefaultFarmer;
import com.stardewvalley.farm.Farm;
import com.stardewvalley.farm.FarmPlot;
import com.stardewvalley.farm.Farmer;
import com.stardewvalley.logic.Calculator;
import com.stardewvalley.logic.CropCalculator;
import com.stardewvalley.seed.Seed;
import com.stardewvalley.seed.StarFruitSeed;

public class Main 
{
    public static void main(String[] args) throws IOException
    {
    	//Input farming skill, crop fertilizer, and seeds
		Farmer farmer = new DefaultFarmer(13);
		CropFertilizer fertilizer1 = new DeluxeCropFertilizer();
		CropFertilizer fertilizer2 = new QualityCropFertilizer();

		Seed seed1 = new StarFruitSeed();
		Seed seed2 = new StarFruitSeed();

		// Farm set up
		Farm farm = new Farm(farmer);
		List<FarmPlot> farmPlots = Arrays.asList(new FarmPlot(seed1, 100000, fertilizer1),
				new FarmPlot(seed2, 100000, fertilizer2));
		farm.addFarmPlots(farmPlots);
		
    	// Harvest
    	Collection<Crop> allCrops = new ArrayList<>();
    	for(FarmPlot farmPlot : farm.getFarmPlots())
    	{
    		Collection<Crop> crops = new ArrayList<>(farmPlot.getNumberOfCrops());
    		crops.addAll(farmPlot.harvest(farmer));
        	CropCalculator cropCalculator = new CropCalculator(crops);
        	
        	int sellPrice = cropCalculator.calculateSell();
        	
//        	System.out.println("Total profit is: $" + (sellPrice - buyPrice));
        	Calculator.calculateProfit(farmPlot, farmer);
        	allCrops.addAll(crops);
    	}
    }
}
