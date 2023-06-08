import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,b,k;
		int a = 65;
		int n=sc.nextInt();
		
		for(i=4;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char) (a+j)+" ");
			}
			System.out.print("\n");
		}
		
		for(b=1;b<=5;b++)
		{
			for(k=0;k<=b;k++)
			{
				System.out.print((char) (a+k)+" ");
			}
			System.out.print("\n");
		}
		
	}
}

