//WJP to find factorial of a number
import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of "+num+"is :"+fact);
	}
}
/*
Enter the number:
5
factorial of 5is :120
*/