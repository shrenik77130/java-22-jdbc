/* WAP to input two numbers and arithmetic symbol at command line. looking symbol perform
   arithmetic operation */


class JavaProgram7
{
	public static void main(String []args) // "19" "38" "+"
	{
		int n=args.length;

		System.out.println("\n Total number of arguments = " + n);

		if(n==3)
		{
			System.out.println("Arithmetic Symbol = " + args[2]);

			float n1=Float.parseFloat(args[0]);
			float n2=Float.parseFloat(args[1]);

			float ans=0.0f;

			// note: in java,compare string objects using equals() method
			if(args[2].equals("+"))
				ans=n1+n2;
			else if(args[2].equals("-"))
				ans=n1-n2;
			else if(args[2].equals("/"))
				ans=n1/n2;
			else if(args[2].equals("x"))
				ans=n1*n2;
			else
				System.out.println("Invalid Arithmetic Symbol");

			System.out.println("\n Answer = " + ans);

		}
	}
}

// Ass: WAP to input number at command line and print its square
