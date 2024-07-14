import java.util.Scanner;
class calci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello World!");
		boolean my_input=true;
	do
	{
		System.out.println("Welcome to calci application");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		System.out.println("Enter the input: ");
		int value =sc.nextInt();
		switch(value)
		{
			case 1:
				{
				System.out.println("Enter a: ");
				int a=sc.nextInt();
                System.out.println("Enter b: ");
				int b=sc.nextInt();
                int res=add(a,b);
				System.out.println("Addition of two num: "+res);
				break;
				}
			case 2:
				{
				System.out.println("Enter a: ");
				int a=sc.nextInt();
                System.out.println("Enter b: ");
				int b=sc.nextInt();
                int res=sub(a,b);
				System.out.println("subtraction of two num: "+res);
				break;
				}
			case 3:
				{
				System.out.println("Enter a: ");
				int a=sc.nextInt();
                System.out.println("Enter b: ");
				int b=sc.nextInt();
                int res=mul(a,b);
				System.out.println("multiplication of two num: "+res);
				break;
				}
			case 4:
				{
				System.out.println("Enter a: ");
				int a=sc.nextInt();
                System.out.println("Enter b: ");
				int b=sc.nextInt();
                int res=div(a,b);
				System.out.println("division of two num: "+res);
				break;
				}
			case 5:
				{
                 System.out.println("Exit........");
                 my_input=false;
				 break;
				}
		    default:
			   {
				System.out.println("Invalid input");
			   }
		}
	}
	while (my_input);
	}
	

	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
}
/*
Hello World!
Welcome to calci application
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter the input:
2
Enter a:
23
Enter b:
25
subtraction of two num: -2
Welcome to calci application
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Enter the input:
5
Exit........

*/