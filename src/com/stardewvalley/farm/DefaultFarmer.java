package com.stardewvalley.farm;

public class DefaultFarmer implements Farmer
{
	private final int farmingSkill;
	
	public DefaultFarmer(int farmingSkill)
	{
		this.farmingSkill = farmingSkill;
	}
	
	@Override
	public int getFarmingSkill()
	{
		return farmingSkill;
	}
}
