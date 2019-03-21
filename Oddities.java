import java.util.*;

public class Oddities
{
	public static void main(String[] args)
	{
		int testCase = Integer.parseInt(args[0]);
		int check;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < testCase; i++)
		{
			check = s.nextInt();

			if (check % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
	}
}
