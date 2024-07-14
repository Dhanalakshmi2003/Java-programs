/*
Write a Java program to determine whether a given integer is a Duck number or not.
A Duck number is a positive, non-zero number that contains [at least one zero] in it.
Example:
3210 is a Duck number because it contains a zero at the end of the number.
8237 is not a Duck number because it does not contain zero in it.
*/
import java.util.Scanner;
class duck_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		int digit;
		while(num>0)
		{
			digit=num%10;
			if(digit==0)
			{
				count++;
			}
			num/=10;
		}
		if(count>0)
		{
			System.out.println("Duck number");
		}
		else
		{
            System.out.println("not a Duck number");
		}
	}
}
/*
Enter the number:
1234
not a Duck number

Enter the number:
1098
Duck number
*/
