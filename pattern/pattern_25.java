import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,z;
		int n=sc.nextInt();
		
		for(i=1;i<=5;i++)
		{
			for(z=i;z>1;z--)
			{
				System.out.print(" ");
			}
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
	}
}
