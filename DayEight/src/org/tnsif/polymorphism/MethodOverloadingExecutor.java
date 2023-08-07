//program to demonstrate on method overloading
package org.tnsif.polymorphism;
class Bollywood
{
	//method 1
		static String showCouple(String str1,String str2) {
			return str1+" loves "+str2;
		}
//			Method 2 -> same name as method 1 but no. of parameter passing is different 
			static String showCouple(String str1,String str2,String str3) {
				return str1+" loves "+str2+" as well as "+str3;		
		}
	}

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println(Bollywood.showCouple("Salman","Aishwarya"));
		System.out.println(Bollywood.showCouple("Salman","Aishwarya","Katrina"));

	}

}
