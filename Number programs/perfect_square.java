// wjp to print perfect square (9,16,25)
import java.util.Scanner;
class perfect_square 
{
	public static void main(String[] args) 
	{
		String ans="not a perfect square";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		for(int i=1;i*i<=num;i++)
		{
			if(num%i==0 && num/i==i)
			{
				ans="perfect square";
				break;
			}
		}
		System.out.println(ans);
	}
}
/*
enter the number:
12
not a perfect square
*/