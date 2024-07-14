/*
Write a Java program to determine whether a given integer number is a Sunny number. 
A number is called a sunny number if the number next to the given number
is a perfect square. In other words, a number N will be a sunny number if [ N+1 is a perfect square].
Example :  N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9.
Hence 80 is a sunny number.
*/
import java.util.Scanner;
class sunny_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		num=num+1;
		String ans="not a sunny number";
		for(int i=1;i*i<=num;i++)
		{
			if(num%i==0 && num/i==i)
			{
				ans="sunny number";
				break;
			}
		}
		System.out.println(ans);
	}
}
/*
Enter the number:
15     //15+1=16 perfect square
sunny number
*/