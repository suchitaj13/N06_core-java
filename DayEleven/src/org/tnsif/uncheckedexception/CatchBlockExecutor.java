package org.tnsif.uncheckedexception;
//program to demonstrate on catch block with multiple exception class
public class CatchBlockExecutor {
	static void print(int arr[])
	{
		try {
		System.out.println(arr[3]);
		}
		
		//we can use multiple catch block in program
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled: "+e );
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {12,3,14};
		print(arr);

	}

}
