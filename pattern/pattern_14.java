1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j;
		int n=sc.nextInt();
		
		/*for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}*/
		
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		
		
		
	}
}
