import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,b,j,c,a;
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i<n)
			{
				for(b=1;b<=1;b++)
				{
				System.out.print("*");
				}
				for(j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				if(i>1&i<n)
				{
					for(c=1;c<=1;c++)
					{
					System.out.print("*");
					}
				//System.out.print("\n");
				}
				System.out.print("\n");
			}
			else
			{
				if(i>=n)
				{
					for(a=1;a<=n;a++)
					{
						System.out.print("*");
					}
				}
			}

		}
	}
}

