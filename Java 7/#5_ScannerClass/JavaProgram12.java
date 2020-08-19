/* WAP to input three numbers and show which is Max */

import java.util.Scanner;

class JavaProgram12
{
	public static void main(String []args)
	{
		int a,b,c;
		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter value of a :");
		a = s1.nextInt();

		System.out.print("\n Enter value of b:");
		b = s1.nextInt();

		System.out.print("\n Enter value of c :");
		c = s1.nextInt();

		if(a>b && a>c)
			System.out.println("a is Max");
		else if(b>a && b>c)
			System.out.println("b is Max");
		else
			System.out.println("c is Max");
	}
}


/*
	Assignments:
	1. WAP to input two numbers from user. perform swapping without temporary variable
	2. WAP to input n1 and n2. print even numbers between them using for loop
	3. WAP to input any number and show its reverse

*/