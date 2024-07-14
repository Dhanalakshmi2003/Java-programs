//WJP to find factorial of a number in range reverse
import java.util.Scanner;
class factorial_range_reverse
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the start: ");
	int start=sc.nextInt();
	System.out.println("Enter the end: ");
	int end=sc.nextInt();
	
	for(int i=start;i>=end;i--)
	{
	long num=i;
	long fact=1L;// store in long becoz of high value
	for(int j=1;j<=num;j++)
	{
		fact=fact*j;
	}
	System.out.println("factorial of "+i+ "is : "+fact);
	}
	}
}
/*
Enter the start:
5
Enter the end:
1
factorial of 5is : 120
factorial of 4is : 24
factorial of 3is : 6
factorial of 2is : 2
factorial of 1is : 1
*/