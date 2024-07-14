//wjp count digits using for loop
import java.util.Scanner;
class countdigit_forloop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=num;i>0;i/=10,count++)
		{

		}
		System.out.println("count of digits: "+count);
	}
}
/*
Enter the number:
123456
count of digits: 6
*/