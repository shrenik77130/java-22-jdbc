/* WAP demonstrate enhanced loop in java */

class JavaProgram18
{
	public static void main(String []args)
	{
		int numbers[] = {10,20,30,40,50};

		//using for loop
		for(int i=0;i<5;i++)
		{
			System.out.println(numbers[i]);
		}

		//enhanced loop
		for(Object R:numbers)
		{
			System.out.println(R);
		}
	}
}


