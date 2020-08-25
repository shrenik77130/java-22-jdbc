/* WAP to input n1 and n2. print even numbers between them in reverse order */

import java.util.Scanner;

class JavaProgram15
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);

		int n1;
		int n2;

		System.out.print("\n Enter n1 :");
		n1 = scan.nextInt(); //20

		System.out.print("\n Enter n2 :");
		n2 = scan.nextInt(); //60

		while(n2>=n1)
		{
			if(n2%2==0)
				System.out.print("\t" + n2);

			n2--;
		}
	}
}