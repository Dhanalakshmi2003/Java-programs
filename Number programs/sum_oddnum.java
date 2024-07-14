// print sum of all odd numbers from 1 to n
import java.util.Scanner;
class sum_oddnum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num=sc.nextInt();
		int sum=0;
		int i;
		for( i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
			sum=sum+i;
			System.out.print(i+" ");
			}
		}
		System.out.println("\nSum of odd numbers: "+sum);
	}
}
/*
Enter num value:
20
1 3 5 7 9 11 13 15 17 19
Sum of odd numbers: 100
*/