package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExcepetionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		/*
		 * try block contains an exception code
		 */
		try {
			System.out.println(x/y);
		}
		//catch block is used to handled that exception
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
		}
	}

}
