import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k;
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}



