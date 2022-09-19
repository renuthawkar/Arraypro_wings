package com.prowingArray;
import java.util.Arrays;
public class Ascedingdec {
	  
public static void main(String[] args) {
	int a[]= {30,20,10,40};
	int str;
	
	for (int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a.length-1;j++) {
			
			if(a[i] > a[j]){
			str=a[i];
			a[i]=a[j];
			a[j]=str;
			}
		}
	}
	

 System.out.println(Arrays.toString(a));
}
}
