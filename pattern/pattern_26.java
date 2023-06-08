
import java.util.Scanner;
class p
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int x,z,y;
		int n=sc.nextInt();
		
		for(x=5;x>=1;x--)
		{
			for(z=x;z<=4;z++)
			{
				System.out.print(" ");
			}
			for(y=x;y>=1;y--)
			{
				System.out.print(y);
			}
			System.out.print("\n");
		}
		
	}
}
