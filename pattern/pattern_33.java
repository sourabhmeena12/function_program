
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j;
		int a = 65;
		int n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char)(a+j)+" ");
			}
			System.out.print("\n");
		}
		int b=65;
		for(int k=2;k>=0;k--)
		{
			for(int x=0;x<=k;x++)
			{
				System.out.print((char)(b+x)+" ");
			}
			System.out.print("\n");
		}
		
		
	}
}

