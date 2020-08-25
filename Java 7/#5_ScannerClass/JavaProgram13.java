/* WAP to input any 5 digit number and replace its last digit with product of first and last
   digit */


import java.util.Scanner;

class JavaProgram13
{
	public static void main(String []args)
	{
		Scanner s1 = new Scanner(System.in);

		int no;
		System.out.print("Enter any 5 Digit Number :");
		no = s1.nextInt();   // 73489

		no = (no/10)*100  +  (no/10000)*(no%10);

		System.out.println("After replace last digit = " + no);
	}
}


/*
	Assignment:
	1. WAP to input 5 digit number and show addition of all digits
	2. WAP to input any character and check that it is Capital, Small, Symbol or any Digit

*/