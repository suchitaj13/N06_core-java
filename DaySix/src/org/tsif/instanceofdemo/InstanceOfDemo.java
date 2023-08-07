package org.tsif.instanceofdemo;
class RBI{
	 protected String ifsccode="RBISONGAO1";
}
class SBI extends RBI
{
	public SBI() {
	super.ifsccode="RBISONGAO1";
	String ifsccode="SBINOOO2161";
	System.out.println(ifsccode);
	/*if parent class and child class variable name is same,
	 * in such case, use super,variable name to access that
	 * variable of parent class inside the child class*/
	System.out.println(super.ifsccode);
	}
	
}
public class InstanceOfDemo {
// program to demonstrate on instance of operator
	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
		
		
	}

}
