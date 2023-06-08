
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k=1;
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j==n||j==1||j==k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			k++;
			System.out.print("\n");
		}
	}
}
