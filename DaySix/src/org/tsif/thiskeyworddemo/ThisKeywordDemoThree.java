package org.tsif.thiskeyworddemo;
class Team
{
	int size;
	Team()
	{
		//calling to parameterized 
//		this(7);
		System.out.println("Default Constructor");
	}
	Team(int size)
	{
		System.out.println("Parameterized constuctor: "+size);
	}
}

public class ThisKeywordDemoThree {

	public static void main(String[] args) {
	Team t=new Team();
	t.size=7;
	}

}
