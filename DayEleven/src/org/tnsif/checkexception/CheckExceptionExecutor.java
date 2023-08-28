package org.tnsif.checkexception;
import java.io.FileInputStream;
public class CheckExceptionExecutor {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("‪C:\\Users\\USER\\Desktop\\hello world.txt");
		{
		System.out.println("File is exists!!");
		System.out.println(f);
				}
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled: "+e);
		}
		
	}

}
