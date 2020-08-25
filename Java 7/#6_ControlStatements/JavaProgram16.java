/* WAP to print factorial of first n numbers */

import java.util.Scanner;

class JavaProgram16
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);

		int n;
		System.out.print("\n Enter value of n :");
		n = scan.nextInt(); //8

		for(int i=1;i<=n;i++)
		{
			int x=i; //5
			int fact=1;

			for(int f=x;f>=1;f--)
			{
				fact = fact*f;
			}

			System.out.println(x + "\t --> " + fact);
		}
	}
}

/* Ass: WAP to input n1 and n2. print prime numbers between them */