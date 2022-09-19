package com.prowingArray;
//import java.util.Array;

class  AvgArray {
	
   public static void avgArray() {		
	
	int sum=0;
	int a[] = {10,20,30,40,50};
	
	
	for (int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];
		
	}
	double avg =sum/a.length;
	{
		
		System.out.println(avg);
		
	}
   }
	
	public static void main(String[] args) {
	    avgArray();
	 
	}
}
