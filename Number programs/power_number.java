//WJP to find the value of number raised to the power of a number
import java.util.Scanner;
class power_number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n=sc.nextInt();
		System.out.println("Enter x value: ");
		int x=sc.nextInt();
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*x;
		}
		System.out.println(ans);
	}
}
/*
Enter the n value:
2
Enter x value:
4
16
*/
