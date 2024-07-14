//print whether it is xylem or phloem
//sum of first and last digit=sum of middle digit
//43212..........4+2=3+2+1

import java.util.Scanner;
class xylem_phloem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int last=num%10;
		int temp=num;
		while(temp>9)
		{
			temp=temp/10;
		}
		int sum1=last+temp;
		System.out.println("sum of first and last: "+sum1);

        int sum2=0;
		num=num/10;
		while(num>9)
		{
			sum2+=num%10;
			num=num/10;
		}
		System.out.println("sum of middle numbers: "+sum2);
        if(sum1==sum2)
			System.out.println("Xylem");
		else
			System.out.println("Phloem");
	}
}
