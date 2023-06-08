
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j;
		int a = 65;
		int n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char) (a+j)+" ");
			}
			System.out.print("\n");
		}
		
		
	}
}

