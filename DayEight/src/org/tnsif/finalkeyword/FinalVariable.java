//program to demonstrate on final keyword
package org.tnsif.finalkeyword;
public class FinalVariable {
	/*final variable must be initialize during declaration*/
	//final int x;
	
	final float SALARY=67000.78f;
	
	void print()
	{
		// we can't change the value of final variable
		//SALARY=89000.76f;
		System.out.println("Salary is: "+SALARY);
	}

}
