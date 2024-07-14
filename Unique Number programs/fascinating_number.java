/*
Write a Java program to determine whether a given number is a fascinating number.
A number is said to be fascinating if, after multiplying it by 2 and 3 separately and 
concatenating the results with the original number, the resultant number contains all 
the digits from 1 to 9 exactly once.
For example, consider the number 327:
327 × 2 = 654
327 × 3 = 981
Concatenating these results with the original number gives:
          "327" + "654" + "981" = "327654981".
This resultant number contains all the digits from 1 to 9 exactly once, making 327 a fascinating number.
*/
import java.util.Scanner;
class fascinating_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num1=sc.nextInt();
        int num2=num1*2;
		int num3=num1*3;
		String result=""+num1+num2+num3;
		//empty quotes becoz after string + operator is considered as concat
		System.out.println("concatenated string: "+result);
		String flag="fascinating number";
		while(result>0)
		{
			digit=result%10;
			for(digit=1;digit<=9;digit++)
			{

			}
			result=result/10;
		}
	}
}
