//program to demonstrate method overriding
package org.tnsif.polymorphism;
class CM{
	static void curruption(String str1,float amount) {
		System.out.println("CM name is: "+str1+ " Coruppted amount of: " + amount);
	}
}
class MLA extends CM{
	static void curruption(String str2,float amount2) {
		CM.curruption("Eknath Shinde", 5000000f);
		System.out.println("MLA name is: "+str2+ " Coruppted amount of: "+ amount2);	
	}

}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MLA.curruption("Manikrao Kokate",250000f);
		

	}

}
