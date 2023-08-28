package org.tnsif.uncheckedexception;
//program to demonstrate on not finally is not executed 
public class FinallyBlockedNotExecutor {
	static void display(int arr[]) {
		try {
		System.out.println(arr[3]);
		/*
		 * If try and catch block contains a System.exit(0);
		 * After the exception code line,then finally block does not execute
		 */
		System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Hnadled: "+e);
			System.exit(0);
		}
		finally
		{
			/*
			 * when finally block contains an exception code then,
			 * finally block does not executed
			 */
			System.out.println("Finally block is alays executed: ");
		}
		System.out.println("Any ststement out of thr block is always"+"executed");
	}
	public static void main(String[] args) {
		int arr[]= {12,6,89};
		display(arr);		

	}

}
