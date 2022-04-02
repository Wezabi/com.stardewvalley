package com.stardewvalley.logic;

import com.stardewvalley.constants.HarvestingTable;
import com.stardewvalley.crop.CropQuality;
import com.stardewvalley.crop.HarvestQualityChances;
import com.stardewvalley.crop.fertilizer.CropFertilizerType;

public class CropUtil {

	private CropUtil()
	{
	}
	
	public static double convertQualityToMultipler(CropQuality quality)
	{
		switch(quality)
		{
			case SILVER:
				return 1.25;
			case GOLD:
				return 1.50;
			case IRIDIUM:
				return 2.00;
			default:
				return 1.00;
		}
	}
	
	public static CropQuality getCropQuality(int farmingSkill, CropFertilizerType fertlizer)
	{
		HarvestQualityChances harvestQualityChances;
		
		switch(fertlizer)
		{
			case BASIC:
				harvestQualityChances = HarvestingTable.BASIC_FERTILIZER_HARVESTING_TABLE.get(farmingSkill);
				break;
			case QUALITY:
				harvestQualityChances = HarvestingTable.QUALITY_FERTILIZER_HARVESTING_TABLE.get(farmingSkill);
				break;
			case DELUXE:
				harvestQualityChances = HarvestingTable.DELUXE_FERTILIZER_HARVESTING_TABLE.get(farmingSkill);
				break;
			default:
				harvestQualityChances = HarvestingTable.NO_FERTILIZER_HARVESTING_TABLE.get(farmingSkill);
		}
		
		double rng = Math.random();
		
		if(rng < harvestQualityChances.getNormalChance())
		{
			return CropQuality.NORMAL;
		}
		else if(rng < harvestQualityChances.getSilverChance())
		{
			return CropQuality.SILVER;
		}
		else if(rng < harvestQualityChances.getGoldChance())
		{
			return CropQuality.GOLD;
		}
		return CropQuality.IRIDIUM;
	}
}
