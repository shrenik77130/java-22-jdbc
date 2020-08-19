/* WAP to read command line arguments and print using println */

class JavaProgram6
{
	public static void main(String []args) // "hello" "180" "false" "john"
	{
		int n = args.length;
		System.out.println("\n Total Number of Arguments = " + n);

		for(int i=0;i<n;i++)
		{
			System.out.println(args[i]);
		}
	}
}