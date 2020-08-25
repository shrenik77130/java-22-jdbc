/* WAP to input n1 and n2. print numbers between them */

import java.util.Scanner;

class JavaProgram14
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);

		int n1,n2;

		System.out.print("\n Enter value of n1 :");
		n1 = scan.nextInt(); //1

		System.out.print("\n Enter value of n2 :");
		n2 = scan.nextInt(); //50

		while(n1<=n2)
		{
			System.out.print("\t" + n1);
			n1++;
		}
	}
}