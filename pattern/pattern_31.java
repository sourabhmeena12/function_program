/*import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k,x;
		int n=sc.nextInt();
			
		for(i=1;i<=n;i=i+2)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			if(i==6)
			{
				for(j=1;j<2;j++)
				{
					System.out.print("*");
				}
			}
			else if(i==8)
			{
				for(x=1;x<=3;x++)
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

		
	}
}
*/
/***
****
******
********
**********
*/

import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,k=1;
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=k;j++)
			{
				System.out.print("*");
			}
			k=k+i;
			System.out.print("\n");
		}
	}
}
