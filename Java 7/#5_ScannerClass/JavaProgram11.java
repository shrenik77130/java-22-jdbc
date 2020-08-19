/* WAP to input two numbers and perform addition, subtraction, multiplication, division */

import java.util.Scanner;

class JavaProgram11
{
	public static void main(String []args)
	{
		int no1,no2;
		Scanner s1 = new Scanner(System.in);

		System.out.print("\n Enter number 1 :");
		no1 = s1.nextInt();

		System.out.print("\n Enter number 2 :");
		no2 = s1.nextInt();

		int sum = no1+no2;
		System.out.print("\n Addition = " + sum);

		int sub = no1-no2;
		System.out.print("\n Subtraction = " + sub);

		int mult = no1*no2;
		System.out.print("\n Multiplication = " + mult);

		float div = no1/no2;
		System.out.print("\n Division = " + div);



	}
}


/*
	Compile Program in Textpad with shortcut : Ctrl + 1
	Run Java Program : Ctrl + 2

*/