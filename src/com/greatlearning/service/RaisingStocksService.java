package com.greatlearning.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class RaisingStocksService {

	public int noOfRaisingStocks(HashMap<Double,Boolean> map,boolean rising) {
        Iterator hmIterator = map.entrySet().iterator();
        int countrise=0;
        int countdecline=0;
        while (hmIterator.hasNext()) {
        	 Map.Entry mapElement= (Map.Entry)hmIterator.next();
        	 if( (boolean) mapElement.getValue()) {
        		 countrise++;
        	 }
        	 else
        	 {
        		countdecline++; 
        	 }
        }
        if(rising) {
        	return countrise;
        }
        else
        {
        	return countdecline;
        }

		
		
	}
}
