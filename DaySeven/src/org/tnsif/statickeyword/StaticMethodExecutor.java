//program to demonstrate Static method
package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	// static method
	
	String str="bkc";
	static float percentage = 70.2f;
	/* 1. If any method outside the main function and if you want */
	
	static void displayScore(int score) 
	{
		System.out.println("Percentage is: "+percentage);
		// We can't use non-static variable inside static method
		//System.out.println(str);
		System.out.println("Score is: "+score);
	}

	public static void main(String[] args) {
		displayScore(56);
		

	}

}
