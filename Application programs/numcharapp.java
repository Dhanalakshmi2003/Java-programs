// application to print 1 to n , a to z, exit
import java.util.Scanner;
class numcharapp
{
	public static void main(String args[])
	{

	boolean flag=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to Numchar Application !");
	System.out.println("Select the input: ");
	System.out.println("1.Enter 1 to n\n2.print A to Z\n3.Exit");
	int input=sc.nextInt();
	do
	{
		System.out.println("Printing from 1 to n");
		if(input==1)
		{
			System.out.println("Enter n value to print 1 to n: ");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println(i+" ");
			}
		}
		else if(input==2)
		{
			char ch='A';
			while(ch<='Z')
			{
				System.out.print(ch+" ");
				ch++;
			}
		}
		else
		{
			System.out.println("Thank you! See you again");
			System.out.println("Do you want to continue:(y/n)");
		    char ch=sc.next().charAt(0);
		    if(ch=='n' || ch=='N')
			flag=false;
		

		}
		
	}
	while (flag);
}
}