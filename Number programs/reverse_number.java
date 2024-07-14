// print reverse of a number
import java.util.Scanner;
class reverse_number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num>0)
		{
	    rev=num%10+rev*10;
		num=num/10;
		}
		System.out.println("reverse of number: "+rev);
	}
}
/*
Enter the number:
6789
reverse of number: 9876
*/
