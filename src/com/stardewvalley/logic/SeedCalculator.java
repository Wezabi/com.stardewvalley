package com.stardewvalley.logic;

import java.util.Collection;

import com.stardewvalley.seed.Seed;

public class SeedCalculator
{
	private final Collection<Seed> seeds;
	
	public SeedCalculator(Collection<Seed> seeds)
	{
		this.seeds = seeds;
	}
	
	public int calculateBuy()
	{
		int totalMoney = 0;
		for(Seed seed : seeds)
		{
			totalMoney = totalMoney + seed.getPrice();
		}
		
		return totalMoney;
	}
}
