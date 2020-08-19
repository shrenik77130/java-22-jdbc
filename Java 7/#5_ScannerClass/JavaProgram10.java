/* WAP to demonstrate Scanner class Methods */

// only java.lang.* defaultly import by java

import java.util.Scanner;

class JavaProgram10
{
	public static void main(String []args)
	{
		int rollno;
		String name;
		float pert;

		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter Roll Number :");
		rollno = s1.nextInt();

		System.out.print("\n Enter Name of Student :");
		name = s1.next();

		System.out.print("\n Enter Percentange :");
		pert = s1.nextFloat();
	}
}