//wjp to check whether it is a pallindrome or not
import java.util.Scanner;
class pallindrome
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
		if(temp==rev)
		   System.out.println("pallindrome number");
		else
			System.out.println("not pallindrome ");
	}
}
/*
Enter the number:
1298
not pallindrome
*/