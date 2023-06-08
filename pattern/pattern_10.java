import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k;
		int n=sc.nextInt();
		for(i=1;i<=n;i=i+2)
		{
			if(i<n)
			{
				for(k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			//System.out.print("\n");
			else
			{
				if(i>=n)
				{
					for(j=1;j<=6;j++)
					{
						System.out.print("*");
					}
				}
			}

			
		}

		
	}
}
