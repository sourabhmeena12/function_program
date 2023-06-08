import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k,x;
		int n=sc.nextInt();
		for(i=1;i<=n;i=i+1)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			if(i==3)
			{
				for(j=1;j<7;j++)
				{
					System.out.print("*");
				}
			}
			else if(i==4)
			{
				for(x=1;x<=12;x++)
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

		
	}
}
