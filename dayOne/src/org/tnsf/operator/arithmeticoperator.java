package org.tnsf.operator;

import java.util.Scanner;

public class arithmeticoperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Addition is"+(num1+num2));
		System.out.println("Substraction is"+(num1-num2));
		System.out.println("Multiplication is"+(num1*num2));
		System.out.println("Division is"+(num1/num2));
		System.out.println("Percentage is"+(num1%num2));
		sc.close();

	}

}
