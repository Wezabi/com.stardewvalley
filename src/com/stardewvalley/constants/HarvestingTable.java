package com.stardewvalley.constants;

import java.util.HashMap;

import com.stardewvalley.crop.HarvestQualityChances;

public final class HarvestingTable 
{
	public static final HashMap<Integer, HarvestQualityChances> NO_FERTILIZER_HARVESTING_TABLE = new HashMap<Integer, HarvestQualityChances>()
    {
        {
        	put(0, new HarvestQualityChances(0.97, 0.02, 0.01, 0.0));
        	put(1, new HarvestQualityChances(0.91, 0.06, 0.03, 0.0));
        	put(2, new HarvestQualityChances(0.85, 0.10, 0.05, 0.0));
        	put(3, new HarvestQualityChances(0.80, 0.13, 0.07, 0.0));
        	put(4, new HarvestQualityChances(0.75, 0.16, 0.09, 0.0));
        	put(5, new HarvestQualityChances(0.69, 0.20, 0.11, 0.0));
        	put(6, new HarvestQualityChances(0.64, 0.23, 0.13, 0.0));
        	put(7, new HarvestQualityChances(0.60, 0.25, 0.15, 0.0));
        	put(8, new HarvestQualityChances(0.55, 0.28, 0.17, 0.0));
        	put(9, new HarvestQualityChances(0.50, 0.31, 0.19, 0.0));
        	put(10, new HarvestQualityChances(0.46, 0.33, 0.21, 0.0));
        	put(11, new HarvestQualityChances(0.42, 0.35, 0.23, 0.0));
        	put(12, new HarvestQualityChances(0.38, 0.37, 0.25, 0.0));
        	put(13, new HarvestQualityChances(0.34, 0.39, 0.27, 0.0));
        }
    };
    
	public static final HashMap<Integer, HarvestQualityChances> BASIC_FERTILIZER_HARVESTING_TABLE = new HashMap<Integer, HarvestQualityChances>()
    {
        {
        	put(0, new HarvestQualityChances(0.88, 0.08, 0.01, 0.0));
        	put(1, new HarvestQualityChances(0.77, 0.15, 0.03, 0.0));
        	put(2, new HarvestQualityChances(0.68, 0.20, 0.05, 0.0));
        	put(3, new HarvestQualityChances(0.59, 0.26, 0.07, 0.0));
        	put(4, new HarvestQualityChances(0.50, 0.31, 0.09, 0.0));
        	put(5, new HarvestQualityChances(0.42, 0.35, 0.11, 0.0));
        	put(6, new HarvestQualityChances(0.35, 0.39, 0.13, 0.0));
        	put(7, new HarvestQualityChances(0.28, 0.42, 0.15, 0.0));
        	put(8, new HarvestQualityChances(0.22, 0.44, 0.17, 0.0));
        	put(9, new HarvestQualityChances(0.16, 0.47, 0.19, 0.0));
        	put(10, new HarvestQualityChances(0.15, 0.44, 0.21, 0.0));
        	put(11, new HarvestQualityChances(0.14, 0.41, 0.23, 0.0));
        	put(12, new HarvestQualityChances(0.13, 0.39, 0.25, 0.0));
        	put(13, new HarvestQualityChances(0.12, 0.36, 0.27, 0.0));
        }
    };
    
	public static final HashMap<Integer, HarvestQualityChances> QUALITY_FERTILIZER_HARVESTING_TABLE = new HashMap<Integer, HarvestQualityChances>()
    {
        {
        	put(0, new HarvestQualityChances(0.78, 0.14, 0.08, 0.0));
        	put(1, new HarvestQualityChances(0.64, 0.23, 0.13, 0.0));
        	put(2, new HarvestQualityChances(0.52, 0.30, 0.18, 0.0));
        	put(3, new HarvestQualityChances(0.40, 0.36, 0.24, 0.0));
        	put(4, new HarvestQualityChances(0.30, 0.41, 0.29, 0.0));
        	put(5, new HarvestQualityChances(0.21, 0.45, 0.34, 0.0));
        	put(6, new HarvestQualityChances(0.15, 0.45, 0.40, 0.0));
        	put(7, new HarvestQualityChances(0.14, 0.41, 0.45, 0.0));
        	put(8, new HarvestQualityChances(0.13, 0.37, 0.50, 0.0));
        	put(9, new HarvestQualityChances(0.11, 0.33, 0.56, 0.0));
        	put(10, new HarvestQualityChances(0.10, 0.29, 0.61, 0.0));
        	put(11, new HarvestQualityChances(0.09, 0.25, 0.66, 0.0));
        	put(12, new HarvestQualityChances(0.07, 0.21, 0.72, 0.0));
        	put(13, new HarvestQualityChances(0.06, 0.17, 0.77, 0.0));
        }
    };
    
	public static final HashMap<Integer, HarvestQualityChances> DELUXE_FERTILIZER_HARVESTING_TABLE = new HashMap<Integer, HarvestQualityChances>()
    {
        {
        	put(0, new HarvestQualityChances(0.66, 0.19, 0.10, 0.06));
        	put(1, new HarvestQualityChances(0.48, 0.27, 0.16, 0.09));
        	put(2, new HarvestQualityChances(0.33, 0.33, 0.22, 0.13));
        	put(3, new HarvestQualityChances(0.21, 0.37, 0.27, 0.16));
        	put(4, new HarvestQualityChances(0.12, 0.37, 0.31, 0.20));
        	put(5, new HarvestQualityChances(0.10, 0.31, 0.35, 0.23));
        	put(6, new HarvestQualityChances(0.09, 0.26, 0.39, 0.27));
        	put(7, new HarvestQualityChances(0.07, 0.21, 0.42, 0.30));
        	put(8, new HarvestQualityChances(0.05, 0.16, 0.45, 0.34));
        	put(9, new HarvestQualityChances(0.04, 0.12, 0.47, 0.37));
        	put(10, new HarvestQualityChances(0.03, 0.08, 0.48, 0.41));
        	put(11, new HarvestQualityChances(0.02, 0.05, 0.49, 0.44));
        	put(12, new HarvestQualityChances(0.01, 0.02, 0.50, 0.48));
        	put(13, new HarvestQualityChances(0.00, 0.00, 0.49, 0.51));
        }
    };
}
