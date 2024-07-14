// wjp to print prime number in range reverse
import java.util.Scanner;
class prime_range_reverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=2;
		int i,j;
		
		System.out.println("Enter the start: ");
		int start=sc.nextInt();
		System.out.println("Enter the End: ");
		int end=sc.nextInt();
		for(i=start;i>=end;i--)
		{
		int num=i;
		for(j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				break;
			}
			
		}
		if(i==j)
			System.out.print(j+" ");
		}
		
	}
}
/*
Enter the start:
100
Enter the End:
1
97 89 83 79 73 71 67 61 59 53 47 43 41 37 31 29 23 19 17 13 11 7 5 3 2
*/
