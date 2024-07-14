//sum of first and last digit using for loop
import java.util.Scanner;
class sum_firstlast_forloop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int last=num%10;
		for(int i=num;num>9;num/=10)
		{
		}
		System.out.println(last+num);
	}
}
/*
Enter number:
1234
5
*/