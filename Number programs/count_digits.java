//wjp to print the count of digits
import java.util.Scanner;
class count_digits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("count of digits: "+count);
	}
}
/*
Enter the number:
7890
count of digits: 4
*/