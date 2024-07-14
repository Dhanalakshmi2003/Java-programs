//wjp to print all natural numbers in reverse from n to 1
import java.util.Scanner;
class numnto1
{
	public static void main(String[] args) 
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		while(n>=i)
		{
			System.out.println(n);
			n--;
		}
		
	}
}