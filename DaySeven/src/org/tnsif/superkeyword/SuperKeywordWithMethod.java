package org.tnsif.superkeyword;
//program to demonstrate on super keyword with method
//parent class
class MET
{
	String ownerName="Chagan Bhujabal";	
	void displayName()
	{
		System.out.println("Owner Is: "+ownerName);
	}
	
}
//child class
class BKC extends MET{
	String ownerName="Shefali Bhujbal";
	void displayName()
	{
		/*if parent class and child class method name is same,
		 * and if you want to access that method inside 
		 * child class,then use
		 * super.methodName();
		 */
		super.displayName();
		System.out.println("Owner Is: "+ownerName);
	}
}
//driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b=new BKC();
		b.displayName();
		

	}

}
