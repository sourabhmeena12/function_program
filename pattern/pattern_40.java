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
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i=6;i>=0;i=i-2)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		
	}
}
        
 