//program to demonstrate Static block
package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	String str;
	static int RollId;
	
	 /*Static Block is used to initialized static variable
 	and we can not initialized any non-static variable inside the static block
 * 
 */
	static{
		RollId=23;
		// str=Suchita;
   System.out.println("Roll Id: "+RollId);
		
	}
	/*we have another  */
	//static  void print() {
	//System.out.println(RollId);
	
	//}
	public static void main(String[] args) {
		/* main function is static and hence it call static block ,
		 * method and variable by default 
		 */
	//	print();
		
		
	}

}
