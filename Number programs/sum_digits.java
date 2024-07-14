//sum of digits 1234=1+2+3+4=10
import java.util.Scanner;
class sum_digits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int digit;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("sum of digits: "+sum);
	}
}
/*
Enter the number:
1234
sum of digits: 10
*/