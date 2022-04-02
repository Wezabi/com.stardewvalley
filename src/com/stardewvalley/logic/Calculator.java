package com.stardewvalley.logic;

import java.util.List;

import com.stardewvalley.crop.Crop;
import com.stardewvalley.crop.fertilizer.BasicCropFertilizer;
import com.stardewvalley.crop.fertilizer.DeluxeCropFertilizer;
import com.stardewvalley.crop.fertilizer.QualityCropFertilizer;
import com.stardewvalley.farm.FarmPlot;
import com.stardewvalley.farm.Farmer;
import com.stardewvalley.seed.Seed;

public class Calculator
{
	public static void calculateProfit(FarmPlot farmPlot, Farmer farmer)
	{
		farmPlot.getCropFertilizer();
		int seedPrice = farmPlot.getSeed().getPrice();
		int seedGrowth = farmPlot.getSeed().getGrowDays();
		Seed seed = farmPlot.getSeed();
		int fertilizerCost = farmPlot.getCropFertilizer().getPrice();
		int totalSeedCost = seedPrice * farmPlot.getNumberOfCrops();
		int totalFertilizerCost = fertilizerCost * farmPlot.getNumberOfCrops();
		int totalCost = totalSeedCost + totalFertilizerCost;
		
		List<Crop> harvestedCrops = farmPlot.harvest(farmer);
		Crop crop = harvestedCrops.get(0);
		int cropValue = crop.getBasePrice();
		int totalCropValue = cropValue * harvestedCrops.size();
		int totalHarvestedCropValue = new CropCalculator(harvestedCrops).calculateSell();
    	int totalProfit = totalHarvestedCropValue - totalCost;
    	float profitPerDay = (totalProfit / seedGrowth);
    	float profitPerCrop = (totalProfit / harvestedCrops.size());
    	boolean isFertilizerWorth = profitPerCrop > 0;
    	
    	String formatInfo = "|== " + "%-40.40s" + " " + "%10.10s" + " ==|\n";
    	
    	System.out.println("\n|=========================================================|");
    	System.out.println("|====================CALCULATIONS FOR=====================|");
    	System.out.format(formatInfo, "Crop seed: ", seed.getSeedName());
    	System.out.format(formatInfo, "Crop seed growth days: ", seedGrowth);
    	System.out.format(formatInfo, "Farmer Level: ", farmer.getFarmingSkill());
    	System.out.format(formatInfo, "Fertilizer Type: ", farmPlot.getCropFertilizer().getType());
    	System.out.format(formatInfo, "Number of Seeds: ", farmPlot.getNumberOfCrops());
    	System.out.println("|=========================================================|");
    	System.out.println("|====================COST CALCUATIONS=====================|");
    	System.out.format(formatInfo, "Seed Price: ", seedPrice);
    	System.out.format(formatInfo, "Fertilizer Cost: ", fertilizerCost);
    	System.out.format(formatInfo, "Total Seed Cost: ", totalSeedCost);
    	System.out.format(formatInfo, "Total Fertilizer Cost: ", totalFertilizerCost);
    	System.out.format(formatInfo, "Total Cost: ", totalCost);
    	System.out.println("|=========================================================|");
    	System.out.println("|====================SELL CALCUATIONS=====================|");
    	System.out.format(formatInfo, "Crop Value:", cropValue);
    	System.out.format(formatInfo, "Total Crop Value:", totalCropValue);
    	System.out.format(formatInfo, "Total Harvested Crop Value:", totalHarvestedCropValue);
    	System.out.println("|=========================================================|");
    	System.out.println("|====================NOTY CALCUATIONS=====================|");
    	System.out.format(formatInfo, "Total Profit: ", totalProfit);
    	System.out.format(formatInfo, "Total Profit per day: ", profitPerDay);
    	System.out.format(formatInfo, "Total Profit per crop: ", profitPerCrop);
    	System.out.format(formatInfo, "Crop worth fertilizer: ", isFertilizerWorth);
	}
	
	public static void calculateFertDiff(FarmPlot farmPlot, Farmer farmer)
	{
		farmPlot.getCropFertilizer();
		int seedPrice = farmPlot.getSeed().getPrice();
		int seedGrowth = farmPlot.getSeed().getGrowDays();
		Seed seed = farmPlot.getSeed();
		int fertilizerCost = farmPlot.getCropFertilizer().getPrice();
		int numberOfCrops = farmPlot.getNumberOfCrops();
		int totalSeedCost = seedPrice * numberOfCrops;
		int totalFertilizerCost = fertilizerCost * numberOfCrops;
		int totalCost = totalSeedCost + totalFertilizerCost;
		
		FarmPlot copyNoFertilizer = new FarmPlot(seed, numberOfCrops);
		FarmPlot copyBasicFertilizer = new FarmPlot(seed, numberOfCrops, new BasicCropFertilizer());
		FarmPlot copyQualityFertilizer = new FarmPlot(seed, numberOfCrops, new QualityCropFertilizer());
		FarmPlot copyDeluxeFertilizer = new FarmPlot(seed, numberOfCrops, new DeluxeCropFertilizer());

		
		List<Crop> actualHarvestedCrops = farmPlot.harvest(farmer);
		Crop crop = actualHarvestedCrops.get(0);
		int cropValue = crop.getBasePrice();
		int totalCropValue = cropValue * actualHarvestedCrops.size();
		int totalHarvestedCropValue = new CropCalculator(actualHarvestedCrops).calculateSell();
    	int totalProfit = totalHarvestedCropValue - totalCost;
    	float profitPerDay = (totalProfit / seedGrowth);
    	float profitPerCrop = (totalProfit / actualHarvestedCrops.size());
    	boolean isFertilizerWorth = profitPerCrop > 0;
    	
    	String formatInfo = "|== " + "%-40.40s" + " " + "%10.10s" + " ==|\n";
    	
    	System.out.println("\n|=========================================================|");
    	System.out.println("|====================CALCULATIONS FOR=====================|");
    	System.out.format(formatInfo, "Crop seed: ", seed.getSeedName());
    	System.out.format(formatInfo, "Crop seed growth days: ", seedGrowth);
    	System.out.format(formatInfo, "Farmer Level: ", farmer.getFarmingSkill());
    	System.out.format(formatInfo, "Fertilizer Type: ", farmPlot.getCropFertilizer().getType());
    	System.out.format(formatInfo, "Number of Seeds: ", numberOfCrops);
    	System.out.println("|=========================================================|");
    	System.out.println("|====================COST CALCUATIONS=====================|");
    	System.out.format(formatInfo, "Seed Price: ", seedPrice);
    	System.out.format(formatInfo, "Fertilizer Cost: ", fertilizerCost);
    	System.out.format(formatInfo, "Total Seed Cost: ", totalSeedCost);
    	System.out.format(formatInfo, "Total Fertilizer Cost: ", totalFertilizerCost);
    	System.out.format(formatInfo, "Total Cost: ", totalCost);
    	System.out.println("|=========================================================|");
    	System.out.println("|====================SELL CALCUATIONS=====================|");
    	System.out.format(formatInfo, "Crop Value:", cropValue);
    	System.out.format(formatInfo, "Total Crop Value:", totalCropValue);
    	System.out.format(formatInfo, "Total Harvested Crop Value:", totalHarvestedCropValue);
    	System.out.println("|=========================================================|");
    	System.out.println("|====================NOTY CALCUATIONS=====================|");
    	System.out.format(formatInfo, "Total Profit: ", totalProfit);
    	System.out.format(formatInfo, "Total Profit per day: ", profitPerDay);
    	System.out.format(formatInfo, "Total Profit per crop: ", profitPerCrop);
    	System.out.format(formatInfo, "Crop worth fertilizer: ", isFertilizerWorth);
	}
}
