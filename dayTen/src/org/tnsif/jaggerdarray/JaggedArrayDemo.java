//program to demonstrate on a jagged array
package org.tnsif.jaggerdarray;
import java.util.Scanner;
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//declaration of a jagged array
		int arr[][]=new int[3][];
		
		arr[0]=new int[2];
		arr[1]=new int[1];
		arr[2]=new int[3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
				
			}
		}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.println(arr[i][j]+" ");
					
				}
				System.out.println();
		}
			s.close();
	}
}			
		
	


