/*
You are developing a math learning application that includes a 
feature to help students identify and understand special numbers.

A special number is defined as a positive integer with m digits, 
that equals the sum of its digits, each raised to the power of m.
To determine if a number is special:
Calculate the number of digits m.
Compute the sum of each digit raised to the power of m.
Check if this sum equals the original number.

Explanation:

Number: 153

It has 3 digits (m=3)

Sum of Digits Raised to the Power of m:
=1^3+5^3+3^3
=1+125+27=>153
=153=153
*/

import java.util.Scanner;
class armstrong_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int arm=0;
		int rem=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(temp==arm)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}
}
/*
Enter the number:
153
Armstrong number
*/