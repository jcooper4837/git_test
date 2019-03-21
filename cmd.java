public class cmd
{
	public static void main(String[] args)
	{
		if (args[0].equals("-i"))
		{
			int control_Num = Integer.parseInt(args[1]);

			if (control_Num == 2)
			{
				int input1 = Integer.parseInt(args[2]);
				input1 += 10;
				System.out.print(input1);
			}//if
			else if (control_Num == 3)
			{
				System.out.print(args[3]);
			}//elseif
			else
			{
				double input4 = Double.parseDouble(args[4]);
				input4 += 10;
				System.out.print(input4);
			}//else
		}//if

		else if (args[0].equals("-a"))
		{
			System.out.println(args[2] + " " + args[3] + " " + args[4]);
		}//elseif

		else if (args[0].equals("-ai") || args[0].equals("-ia"))
		{
			int input1 = Integer.parseInt(args[2]);
			input1 += 10;
			double input4 = Double.parseDouble(args[4]);
			input4 += 10;
			System.out.println(input1 + " " + args[3] + " " + input4);
		}//elseif

		else
		{
			int control_Num = Integer.parseInt(args[0]);

			if (control_Num == 1)
			{
				int input1 = Integer.parseInt(args[1]);
				input1 += 10;
				System.out.print(input1);
			}//if

			else if (control_Num == 2)
			{
				System.out.print(args[2]);
			}//elseif

			else
			{
				double input4 = Double.parseDouble(args[3]);
				input4 += 10;
				System.out.print(input4);
			}//else
		}//else				
	}//main
}//cmd
