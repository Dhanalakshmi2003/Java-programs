/*
Write a Java program to determine whether a given integer number is a Tech number.
A number is called a tech number if the given number has an even number of digits 
and the number can be divided exactly into two parts from the middle. After equally 
dividing the number, sum up the numbers and find the square of the sum. If we get the 
number itself as square, the given number is a tech number, else, not a tech number.
Example :   number = 2025 
                                  = 20 + 25 
                                  = (45)2
                                  2025 = 2025 
	             Hence 2025 is a Tech number.[Symmetric power number -- same logic]
*/
import java.util.Scanner;
class Tech_number
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
    int num=sc.nextInt();
	int square=0;
	for(int i=1000;i<9999;i++)
	{
	int first=num/100;// removes last two digit
	int second=num%100;// gives last 2 digits

	int sum=first+second;
	square=sum*sum;
	}
	if(square==num)
		System.out.println("Tech number");
	else
		System.out.println("Not a tech number");
	}
}
/*
Enter the number:
3025
Tech number

Enter the number:
1312
Not a tech number
*/
