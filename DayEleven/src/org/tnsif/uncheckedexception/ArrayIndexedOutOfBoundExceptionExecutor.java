package org.tnsif.uncheckedexception;
//program to demonstrate on ArrayIndexedOutOfBoundException
public class ArrayIndexedOutOfBoundExceptionExecutor {
	static void display(int arr[]) {
		try {
		System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Hnadled: "+e);
		}
		finally
		{
			System.out.println("Finally block is alays executed: ");
		}
		System.out.println("Any ststement out of thr block is always"+"executed");
	}

	public static void main(String[] args) {
		int arr[]= {12,6,89};
		display(arr);

	}

}
