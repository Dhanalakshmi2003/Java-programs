//print tables,get input from user
import java.util.Scanner;
class tables
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+"X"+n+"="+(i*n)); // use n instead of i and i instead of n
		}
	}
}
/*

E:\Dhanajava\interview Questions java\Number programs>java num3
Enter n value:
10
1X10=10
2X10=20
3X10=30
4X10=40
5X10=50
6X10=60
7X10=70
8X10=80
9X10=90
10X10=100
*/