
import java.util.Scanner;
class po
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k;
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j<n-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.print("\n");
			
			
		}
	}
}



/*import java.util.Scanner;
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
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}

		
	}
}
*/
