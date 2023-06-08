
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j;
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		
		
	}

}
/*1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4*/