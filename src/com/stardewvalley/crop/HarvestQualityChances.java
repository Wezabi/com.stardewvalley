package com.stardewvalley.crop;

public class HarvestQualityChances 
{
	private final double normalChance;
	private final double silverChance;
	private final double goldChance;
	private final double iridiumChance;
	
	public HarvestQualityChances(double normalChance, double silverChance, double goldChance, double iridiumChance)
	{
		this.normalChance = normalChance;
		this.silverChance = silverChance;
		this.goldChance = goldChance;
		this.iridiumChance = iridiumChance;
	}
	
	public double getNormalChance()
	{
		return normalChance;
	}
	
	public double getSilverChance()
	{
		return silverChance;
	}
	
	public double getGoldChance()
	{
		return goldChance;
	}

	public double getIridiumChance()
	{
		return iridiumChance;
	}
}
