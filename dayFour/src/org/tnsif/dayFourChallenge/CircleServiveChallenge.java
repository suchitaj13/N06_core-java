/*There are n people standing in a circle waiting to be executed.
*The counting out begins at some point in the circle and proceeds 
*around the circle in fix direction.
*I
*n each state a certain people are skipped 
*and next person are person is executed.
*The elimination proceeds around the circle(which is becoming smaller and smaller
*as the executed people are removed),until only the last person remains,who is given freedom.
*given:
*Total No of person:N
*A number came that indicates
*					:k-1 person are skipped
*					and the k person is killed in the circle
*The task is to choose the person in the initial circle that sirvives 
**/
package org.tnsif.dayFourChallenge;

import java.util.Scanner;

public class CircleServiveChallenge {
	static int survive(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value for n and k:");
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
		
		
		
		

	}

}
