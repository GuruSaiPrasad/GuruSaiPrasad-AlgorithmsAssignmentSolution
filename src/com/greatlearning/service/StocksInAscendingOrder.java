package com.greatlearning.service;

public class StocksInAscendingOrder {

	 public void sort(Double arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            Double key = arr[i];
	            int j = i - 1;
	 
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
}
