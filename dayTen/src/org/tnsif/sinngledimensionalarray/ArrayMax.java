package org.tnsif.sinngledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Program to demonstrate on array using run-time input values
 * to find largest element in an array
 */
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total no of array elements");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			System.out.println(arr[i]+" ");
			
		}
		int max=arr[0];//23
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element is:"+max);
		Arrays.sort(arr);
		System.out.println("Sorted elemts are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		s.close();
	}
}
