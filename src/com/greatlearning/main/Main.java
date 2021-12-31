package com.greatlearning.main;

import java.util.HashMap;
import java.util.Scanner;

import com.greatlearning.service.RaisingStocksService;
import com.greatlearning.service.StockPriceSearch;
import com.greatlearning.service.StocksInAscendingOrder;
import com.greatlearning.service.StocksInDescendingOrder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int ch;

		System.out.println("Enter the number of companies = ");
		int noOfCompanies=scan.nextInt();
		Double stocks[]=new Double[noOfCompanies];
		HashMap<Double, Boolean> map=new HashMap<Double, Boolean>();
		for(int i=0;i<stocks.length;i++)
		{
			System.out.println("Enter current stock price of the company "+(i+1)+" =");
			stocks[i]=scan.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			Boolean status=scan.nextBoolean();
			map.put(stocks[i], status);
		}
		do {
		System.out.println();
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Enter the operation that you want to perform ");
		
		System.out.println("1. Display the companies stock prices in ascending order ");
		
		System.out.println("2. Display the companies stock prices in descending order ");
		
		System.out.println("3. Display the total no of companies for which stock prices rose today ");
		
		System.out.println("4. Display the total no of companies for which stock prices declined today ");
		
		System.out.println("5. Search a specific stock price ");
		
		System.out.println("6. press 0 to exit ");
		
		System.out.println();
		
		System.out.println("---------------------------------------------------");
		 ch=scan.nextInt();
		 
		 switch (ch) {
		case 1: 
			StocksInAscendingOrder ascendingOrder=new StocksInAscendingOrder();
			ascendingOrder.sort(stocks);
			System.out.println("Stocks in Ascending Order ");
			for(Double d:stocks) {
				System.out.println(d);
			}
			break;
		case 2:
			StocksInDescendingOrder descendingOrder=new StocksInDescendingOrder();
			descendingOrder.sort(stocks);
			System.out.println("Stocks in Descending Order ");
			for(Double d:stocks) {
				System.out.println(d);
			}
			break;
		case 3:
			RaisingStocksService raisingStocksService=new RaisingStocksService();
			int count=raisingStocksService.noOfRaisingStocks(map,true);
			System.out.println("Total no of companies whose stock price rose today "+count);
			break;
		case 4:
			RaisingStocksService raisingStocksService2=new RaisingStocksService();
			int countdecline=raisingStocksService2.noOfRaisingStocks(map,false);
			System.out.println("Total no of companies whose stock price declined today "+countdecline);
			break;
		case 5:
			
			System.out.println("Enter the key value ");
			Double key=scan.nextDouble();
			StockPriceSearch priceSearch=new StockPriceSearch();
			int result=priceSearch.linearSearch(stocks, key);
			 if (result == -1)
		            System.out.println("Element not present");
		        else
		            System.out.println("Element found "
		                               + key);
			break;
		case 0:
			System.out.println("Exited successfully");
		
		}
		 
		
		}while(ch!=0);
		
		
	}

}
