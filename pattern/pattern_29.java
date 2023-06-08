
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int x,y,z;
		int n=sc.nextInt();
		for(x=1;x<=n;x++)
		{
			for(z=x;z>1;z--)
			{
				System.out.print(" ");
			}
			for(y=x;y<=n;y++)
			{
				System.out.print(x);
			}
			System.out.print("\n");
		}
	}
}


