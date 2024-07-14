/*
 * You are developing a biology learning application that 
 * introduces students to the concept of balance in numbers.
As part of an interactive quiz feature, you want to create a 
program that determines if a given number exhibits "Harmony."
Concept:
Harmonious Number: A positive integer N is classified as a 
Harmonious Number if the sum of its first and last digits equals 
the sum of its remaining digits.
Non-Harmonious Number: If the sum of the first and last digits 
does not equal the sum of the remaining digits, the number is 
classified as Non-Harmonious.
Example:
For input number 2468:
First digit and Last digit: 2,8
Remaining digits: 4, 6
Sum of first and last digits = 2 + 8 = 10
Sum of remaining digits = 4 + 6 = 10
Since the sum of first and last digits equals the sum of remaining
digits, 2468 is a Harmonious Number.
Test Case 1: 

	Input  : 1235
	Output : Harmony
*/

//print whether it is xylem or phloem(same logic)
//sum of first and last digit=sum of middle digit
//43212..........4+2=3+2+1

import java.util.Scanner;
class harmonious_number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int last=num%10;
		int temp=num;
		while(temp>9)
		{
			temp=temp/10;
		}
		int sum1=last+temp;
		System.out.println("sum of first and last: "+sum1);

        int sum2=0;
		num=num/10;
		while(num>9)
		{
			sum2+=num%10;
			num=num/10;
		}
		System.out.println("sum of middle numbers: "+sum2);
        if(sum1==sum2)
			System.out.println("Harmonious number");
		else
			System.out.println("Not a Harmonious number");
	}
}
/*
Enter the number:
2468
sum of first and last: 10
sum of middle numbers: 10
Harmonious number
*/