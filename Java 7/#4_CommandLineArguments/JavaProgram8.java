/* WAP to input some arguments at command line and print them in reverse order */


class JavaProgram8
{
	public static void main(String []args) // "18" "19" "20"
	{
		System.out.println("\n Java Program8 to print Command Line Arguments in Reverse");

		for(int i=args.length-1;i>=0;i--)
		{
			System.out.println(args[i]);
		}
	}
}