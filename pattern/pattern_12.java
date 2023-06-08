import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j;
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i=1 || i==n || j==1 || j==n)	
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
