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
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.print("\n");
			for(k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}
