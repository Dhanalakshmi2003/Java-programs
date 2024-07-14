//wjp to check the given is integer or letter or special character and print the ascii values
import java.util.Scanner;
class valuefinder
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z'))
		{
			System.out.println("The letter "+ch+" is a alphabet");
			System.out.println("The ascii value of letter is : "+(int)ch);
		}
		else if((ch>='A' && ch<='Z'))
		{
			System.out.println("The letter "+ch+" is a alphabet");
			System.out.println("The ascii value of letter is : "+(int)ch);
		}

		else if(ch>'0' && ch<='9')
		{
			System.out.println("The letter "+ch+" is a integer");
			System.out.println("The ascii value of letter is : "+(int)ch);
		}
		else
		{
			System.out.println("the letter "+ch+" is a Special character");
			System.out.println("The ascii value of letter is : "+(int)ch);
		}
	}
}
/*
Enter a character:
@
the letter @ is a Special character
The ascii value of letter is : 64
*/