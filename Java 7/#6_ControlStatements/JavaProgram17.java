/* WAP to input username and check following conditions
   1. username should be between 6 to 13 characters
   2. must not contain any symbol
   3. should contain at least one digit

  */

import java.util.Scanner;

class JavaProgram17
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);

		String username;

		System.out.print("\n Enter Username :");
		username = scan.next();  // shrenik13#2

		//1
		int totalCharacters = username.length();

		//2
		int symbolCnt=0;
		for(int i=0;i<totalCharacters;i++)
		{
			char ch = username.charAt(i);
			if( !(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57) )
				symbolCnt++;
		}

		//3.
		int digitCnt=0;
		for(int i=0;i<totalCharacters;i++)
		{
			char ch = username.charAt(i);
			if(ch>=48 && ch<=57)
				digitCnt++;
		}

		if(totalCharacters>=6 && totalCharacters<=13 && symbolCnt==0 && digitCnt>0)
		{
			System.out.println("Username valid");
		}
		else
		{
			System.out.println("Username not valid");
		}
	}
}