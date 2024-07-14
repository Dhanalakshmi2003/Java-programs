// wjp to print prime number in range
import java.util.Scanner;
class prime_range
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
		for(i=start;i<=end;i++)
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
1
Enter the End:
100
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/
