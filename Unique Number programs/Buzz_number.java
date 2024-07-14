/*
Write a java program to find whether the given integer number in Buzz number or not.
Buzz number is a number that ends with digit 7 or divisible by 7.
Example :  42 is a Buzz number because it is divisible by 7.
107 is a Buzz number because it ends with 7.
*/
import java.util.Scanner;
class Buzz_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
	    if(num%10==7 || num%7==0)
		{
		   System.out.println("Buzz number");
		}
	    else
		{
		   System.out.println("Not a buzz number");
		}		
	}
}
/*
Enter the Number:
127
Buzz number
*/