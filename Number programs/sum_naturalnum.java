// print sum of all natural numbers from 1 to n
import java.util.Scanner;
class sum_naturalnum 
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
			sum=sum+i;
			System.out.print(i+" "+"\n");
		}
		System.out.println("Sum of natural numbers: "+sum);
	}
}
/*
Enter num value:
12
1
2
3
4
5
6
7
8
9
10
11
12
Sum of natural numbers: 78
*/