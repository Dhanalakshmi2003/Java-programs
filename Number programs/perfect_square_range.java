// wjp to print perfect square in range
import java.util.Scanner;
class perfect_square_range
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start: ");
		int start=sc.nextInt();
		System.out.println("enter the end: ");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
	    int num=i;
		for(int j=1;j*j<=num;j++)
		{
			if(num%j==0 && num/j==j)
			{
				System.out.println("perfect square of "+j+" is "+j*j);
			}
		}
		}

	}
}
/*
enter the start:
1
enter the end:
10
perfect square of 1 is 1
perfect square of 2 is 4
perfect square of 3 is 9
*/