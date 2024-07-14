//wjp to find perfect number
import java.util.Scanner;
class perfect_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
			System.out.println(num+" is a Perfect number");
		else
		    System.out.println(num+" is Not a Perfect number");
	}
}
/*
Enter the number:
6
6 is a Perfect number
*/
// 6 and 28 are perfect num