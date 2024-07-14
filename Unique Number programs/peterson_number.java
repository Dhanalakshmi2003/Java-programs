/*peterson number
A number is said to be Peterson if the sum of factorials 
of each digit is equal to the sum of the number itself.
example:
145 = !1 + !4 + !5

=1+4*3*2*1+5*4*3*2*1

=1+24+120

145=145
*/


import java.util.Scanner;
class peterson_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int digit=num%10;
            int fact=1;
			while(digit>0)
			{
				fact=fact*digit;
				digit--;
				
			}
			sum=sum+fact;
			num/=10;
			
		}
		if(temp==sum)
			System.out.println("peterson number "+sum);
		else
			System.out.println("not a peterson number "+sum);

	}
}
/*
Enter the number:
145
peterson number 145

Enter the number:
1234
peterson number 33
*/
