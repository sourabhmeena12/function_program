import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k;
		int n=sc.nextInt();
		for(i=2;i<=n;i=i+2)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		
	}
}
