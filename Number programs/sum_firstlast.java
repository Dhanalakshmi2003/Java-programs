//wjp to print sum of first and last
import java.util.Scanner;
class sum_firstlast
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int lastdigit=num%10;
		int sum=0;
		while(num>9)
		{//to extract first digit
		   
		   num=num/10;
		}
		//sum first and last
		sum=lastdigit+num;
		System.out.println("sum of first and last digit: "+sum);
	}
}
/*
Enter the number:
2345
sum of first and last digit: 7
*/