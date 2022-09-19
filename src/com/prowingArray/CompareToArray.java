package com.prowingArray;
import java.util.Arrays;
public class CompareToArray {
	public static void compare() {

	
	int []a= {10,20,30,40};
	int []b= {10,20,90,40};
	int count=0;
	
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]!=b[i]) 
		
		count++;
	
	}
	if (count==0)
		System.out.println("Exact match");
	
	else 
		System.out.println("not Exact match");
		
		}
	
		public static void main(String[] args) {
			compare();
		}
}
