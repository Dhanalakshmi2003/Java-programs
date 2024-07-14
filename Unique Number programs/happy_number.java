// Happy number
import java.util.Scanner;
class happy_number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int square; 
		while(num>9)
		{
			while(num>0)
			{
				square=num%10; //29%10=9
				sum+=square*square; //9*9=81
				num/=10; // 29/10=2

			}
			num=sum;
			sum=0;
		}
		if(num==1)
			System.out.println("happy number");
		
	}
}
/*
enter the number:
19
happy number
*/
