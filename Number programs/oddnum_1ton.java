//wjp to print odd numbers from 1 to 100
import java.util.Scanner;
class oddnum_1ton 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}

	}
}
/*
Enter the n value:
20
1 3 5 7 9 11 13 15 17 19
*/
