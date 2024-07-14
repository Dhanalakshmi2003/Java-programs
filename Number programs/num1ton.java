//wjp to print all natural numbers from 1 to n
import java.util.Scanner;
class num1ton
{
	public static void main(String[] args) 
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
	}
}
/*
Enter n value:
10
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
*/
