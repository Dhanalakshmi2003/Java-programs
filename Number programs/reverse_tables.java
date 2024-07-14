//print tables in reverse
import java.util.Scanner;
class reverse_tables
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(n+"X"+i+"="+(i*n)); // use n instead of i and i instead of n
		}
	}
}

E:\Dhanajava\interview Questions java\Number programs>java num4
Enter n value:
10
10X10=100
10X9=90
10X8=80
10X7=70
10X6=60
10X5=50
10X4=40
10X3=30
10X2=20
10X1=10