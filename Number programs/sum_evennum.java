// print sum of all even numbers from 1 to n
import java.util.Scanner;
class sum_evennum 
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
			if(i%2==0)
			{
			sum=sum+i;
			System.out.print(i+" ");
			}
		}
		System.out.println("\nSum of Even numbers: "+sum);
	}
}
/*
Enter num value:
20
2 4 6 8 10 12 14 16 18 20
Sum of Even numbers: 110
*/