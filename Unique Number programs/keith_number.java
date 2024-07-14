/*
Write a Java program to determine whether a given positive n-digit number is a Keith number. 
A Keith number is a number that appears in a special sequence generated using its digits.
The sequence starts with the digits of the number, and each subsequent term is the sum of 
the previous n terms.
For example, to check if 742 is a Keith number:
Separate each digit: 7, 4, 2.
Generate the sequence by adding the last three terms:
7, 4, 2
7 + 4 + 2 = 13 → 7, 4, 2, 13
13 + 2 + 4 = 19 → 7, 4, 2, 13, 19
19 + 13 + 2 = 34 → 7, 4, 2, 13, 19, 34
34 + 19 + 13 = 66 → 7, 4, 2, 13, 19, 34, 66
66 + 34 + 19 = 119 → 7, 4, 2, 13, 19, 34, 66, 119
119 + 66 + 34 = 219 → 7, 4, 2, 13, 19, 34, 66, 119, 219
219 + 119 + 66 = 404 → 7, 4, 2, 13, 19, 34, 66, 119, 219, 404
404 + 219 + 119 = 742 → 7, 4, 2, 13, 19, 34, 66, 119, 219, 404, 742
Since the sequence eventually includes the original number 742, it is a Keith number.
*/

import java.util.Scanner;
class keith_number  
{
	public static void main(String[] args) 
	{
		int digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int rev=0;
		//to seperate each digit
		while(num>0)
		{
			digit=num%10;
			sum=sum+rev;
			num/=10;
			System.out.print(digit+" ");
			
		}
		System.out.print(sum+" ");
		
		/*//to reverse the digits
		int rev=0;
		int temp=num;
		while(digit>0)
		{
			rev=num%10+rev*10;
			nu/=10;
			System.out.print(rev+" ");
		}
		*/
		
	}
}
