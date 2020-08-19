/* WAP to input n1 and n2 as two numbers in command line. print numbers between them using
   for loop */

class JavaProgram9
{
	public static void main(String []args) // "10"  "50"
	{
		int n=args.length;

		if(n==2)
		{
			int n1=Integer.parseInt(args[0]);  //10
			int n2=Integer.parseInt(args[1]);  //50

			for(int no=n1;no<=n2;no++)
			{
				System.out.print("\t" + no);
			}
		}
		else
		{
			System.out.println("\n Invalid Number of Arguments");
		}
	}
}

/*
Ass1 : WAP to input number at command line and check that number is palindrome or not

	#1
	sample-input : 134
	sample-output : not palindrome

	#2
	sample-input : 1991
	sample-output : palindrome number

Ass2 : WAP to input three numbers at command line and print them in ascending order

	#1
	sample-input : 16 3 4
	sample-output : 3 4 16

Ass3 : WAP to input n1 and n2 as two integers at commandline argument. print numbers
between them which are divisible by 5 and 3

	#1
	sample-input : 11	50
	sample-output : 15 30 45

*/