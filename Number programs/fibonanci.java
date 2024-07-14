// fibonanci series 0 1 1 2 3 5 ...
import java.util.Scanner;
class fibonanci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		int c=0;

		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
/*
Enter number:
13
0 1 1 2 3 5 8 13 21 34 55 89 144
*/