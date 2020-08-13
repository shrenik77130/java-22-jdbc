/* WAP to print 3 records of Product using identifiers in print function */


class JavaProgram4
{
	public static void main(String []args)
	{
		// print prodcode, name, price, qtys, total_amount

		System.out.print(String.format("\n %10d %20s %10.2f %5d %10.2f",183,"Mouse",700.00f,12,700.00f*12));
		System.out.print(String.format("\n %10d %20s %10.2f %5d %10.2f",184,"Micro Processor",5000.00f,7,5000.00f*7));
		System.out.print(String.format("\n %10d %20s %10.2f %5d %10.2f",185,"Motherboard",3500.00f,5,3500.00f*5));
	}
}

//Ass: WAP to declare two variables. keep values. show before and after swapping