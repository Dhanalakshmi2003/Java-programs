import java.util.Scanner;
class prime_number 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int count=2;
		//for(i=n-1;i>=2;i--)
		for(i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		   System.out.println("Prime number");
		else
	       System.out.println("Not prime number");
		
	}
}
/*
Enter the number:
7
Prime number
*/
