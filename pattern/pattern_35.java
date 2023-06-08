

import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,y;
		int a = 65;
		int n=sc.nextInt();
		
		int b=65;
		for(int k=3;k>=0;k--)
		{
			for(y=0;y<k;y++)
			{
				System.out.print(" ");
			}
			for(int x=0;x<=k;x++)
			{
				System.out.print((char)(b+x)+" ");
			} 
			System.out.print("\n");
		}
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char)(a+j)+" ");
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
		int i,j,k,x,y,z;
		int a = 65;
		int n=sc.nextInt();
		
		int b=65;
		for(i=0;i<=n;i++)
		{
			for(k=0;k<i;k++)
			{
				System.out.print("  ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print((char)(a+j)+" ");
			}
			System.out.print("\n");
		}
		for(x=0;x<n;x++)
		{
			for(y=3;y>x;y--)
			{
				System.out.print(" ");
			}
			for(z=0;z<x;z++)
			{
				System.out.print((char)(b+z)+" ");
			}
			System.out.print("\n");
		}
		
		
	}
}
*/