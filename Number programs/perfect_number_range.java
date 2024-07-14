//wjp to find perfect number in range from 1 to 100
import java.util.Scanner;
class perfect_number_range
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start: ");
		int start=sc.nextInt();
		System.out.println("Enter the end: ");
        int end=sc.nextInt();
		for(int i=start;i<=end;i++)//range
		{
		int num=i;
		int sum=0;
		for(int j=1;j<num;j++)//finding perfect num
		{
			if(num%j==0)
			{
				sum+=j;
			}
		}
		if(num==sum)
		   System.out.println(num);
		}

	}
}

/*
Enter the start:
1
Enter the end:
100
6
28
*/