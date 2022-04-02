package com.stardewvalley.farm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Farm 
{
	private final Farmer farmer;
	private List<FarmPlot> farmPlots = new ArrayList<>();
	
	public Farm(Farmer farmer)
	{
		this.farmer = farmer;
	}
	
	public void addFarmPlot(FarmPlot farmPlot)
	{
		farmPlots.add(farmPlot);
	}
	
	public void addFarmPlots(Collection<FarmPlot> farmPlots)
	{
		this.farmPlots.addAll(farmPlots);
	}
	
	public Collection<FarmPlot> getFarmPlots()
	{
		return farmPlots;
	}
}
