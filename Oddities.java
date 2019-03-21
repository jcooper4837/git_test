import java.util.*;

public class Oddities
{
	public static void main(String[] args)
	{
		int testCase = Integer.parseInt(args[0]);
		int check;
		Scanner s = new Scanner(System.in);

		if (testCase == 0)
			System.out.println("No test cases given");

		for (int i = 0; i < testCase; i++)
		{
			check = s.nextInt();

			if (check % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}//for
	}//main
}//class
