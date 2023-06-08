import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k,a,b,c;
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		for(a=1;a<n;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print("  ");
			}
			for(c=1;c<2*(n-a);c++)
			{
				System.out.print(" *");
			}	
			System.out.print("\n");
		}
				
		

	}
}



