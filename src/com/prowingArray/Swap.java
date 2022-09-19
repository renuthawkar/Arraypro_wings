package com.prowingArray;
import java.util.Arrays;
import java.util.Scanner;
 class Swap {
	 public static void main(String[] args) {
		Swap();
	}
	public static void Swap()
	{
   int []a= {10,20,30,40};
   System.out.println(Arrays.toString (a));
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any two index for ");
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   
   int c=0;
   c=a[num1];
   a[num1]=a[num2];
   a[num2]=c;
   System.out.println(Arrays.toString(a));
  }
}
 
