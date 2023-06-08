
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int i,j,number=1;
		int n=sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(number + " ");
				number++;
			}
			System.out.print("\n");
		}
		
		
	}
}
