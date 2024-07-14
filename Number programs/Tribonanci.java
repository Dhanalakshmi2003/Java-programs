// tribonanci series---adding 3 numbers
import java.util.Scanner;
class Tribonanci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		int c=a+b;
		int d=0;

		for(int i=2;i<n;i++)
		{
			d=a+b+c;
			System.out.print(c+" ");
			a=b;
			b=c;
			c=d;
		}
	}
}
/*
Enter number:
12
0 1 1 2 4 7 13 24 44 81 149 274
*/