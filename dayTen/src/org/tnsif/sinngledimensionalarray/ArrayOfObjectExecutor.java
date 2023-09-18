package org.tnsif.sinngledimensionalarray;

public class ArrayOfObjectExecutor {

	public static void main(String[] args) {
		Student arr[]=new Student[3];
		arr[0]=new Student(101,"Suchita Jadhav",45000.53);
		arr[1]=new Student(102,"Piyusha Gaikawd",54500.23);
		arr[2]=new Student(103,"Sejal Patil",65000.45);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}

	}

}
