package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		//setting a value to private data members
		HDFC h=new HDFC();
		h.setAccType("Saving Account");
        h.setAccountNO(345671235678L);
        h.setAtmCardNO(34567891234L);
        h.setPinNo(1332);
        //System.out.println("Acoount No.is"+h.getAccountNO());
        //below line will call to toString() method
        
        System.out.println(h);
 }
}