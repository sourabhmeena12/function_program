
import java.util.Scanner;
class po
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int row=sc.nextInt();
		for(int i=1;i<=row*2-1;i++)
		{
			for(int j=1;j<=row*2-1;j++)
			{
				if((j==1&&i<=row)||j==row||(j>=row&&i==1)||(i==row*2-1&&j<=row)||i==row||(j==row*2-1&&i>row))
				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.print("\n");
		}
	}
}
