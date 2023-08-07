//program to demonstrate on super constructor
package org.tnsif.superkeyword;
//parent class
class Google
{
	String ceo;
	public Google(String ceo) {
		System.out.println("Deafult Constructor: "+ceo);
	}
	}
//child class
class Gmail extends Google
{
	String userid;
	public Gmail(String ceo,String userid) {
		//calling to parent class parameterized constructor
		super(ceo);
		this.userid=userid;
		System.out.println("User Id: "+userid);
	}
	}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g= new Gmail("Suchita Jadhav","abc@gmail.com");
	}

}
