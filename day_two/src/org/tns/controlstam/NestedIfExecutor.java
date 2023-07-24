//program to demonstrate on bunjee jumping using nested if
package org.tns.controlstam;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your weight:");
		int weight=sc.nextInt();
		if(age>12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bunjee Jumping");
				if(weight>=100)
				{
					System.out.println("Extra Ropes to be Added...");
				}
			}
		}
		else
		{
			System.out.println("Not Eligible for bunjee Jumping");
		}
		sc.close();
	}

}

