package com.greatlearning.service;

public class StockPriceSearch {
	public  int linearSearch(Double[] arr, Double key){    
        for(int i=0;i<arr.length;i++){    
  
            if(Double.compare(arr[i], key)==0){ 
            	
                return i;    
            }    
        }    
        return -1;    
    }    
}
