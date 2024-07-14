import java.util.Scanner;
class guess_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int magic_num=(int)(Math.random()*100); //generating random num
		boolean repeat_num=true;
		System.out.println("Welcome to the guessing game!");
		do //start
		{
			int count=0; //digit count		
			System.out.println("Enter the user guess: ");
			int user_guess=sc.nextInt();
			if(user_guess<magic_num)
			{
				System.out.println("lower than magic number");
			}
			else if(user_guess>magic_num)
			{
				System.out.println("greater than magic number!");
			}
			else
			{
				System.out.println("Yaayyyy!! great, you got it");

                //digit count
				while(user_guess>0)
				{
					user_guess=user_guess/10;
					count++;
				}
				System.out.println("Count of user guess digit: "+count);
                
				// to continue or exit
				System.out.println("Do you want to continue");
			    System.out.println("1.yes\n2.No exit");
			    int exit_not=sc.nextInt();
		        if(exit_not==2)
				    repeat_num=false; //exit if false
			}
			
		}
		while (repeat_num); //end
	}
}
/*
Microsoft Windows [Version 10.0.19045.4412]
(c) Microsoft Corporation. All rights reserved.

E:\Dhanajava>javac randnum.java

E:\Dhanajava>java randnum
Welcome to the guessing game!
Enter the user guess:
19
lower than magic number
Enter the user guess:
70
lower than magic number
Enter the user guess:
80
greater than magic number!
Enter the user guess:
78
greater than magic number!
Enter the user guess:
72
Yaayyyy!! great, you got it
Count of user guess digit: 2
Do you want to continue
1.yes
2.No exit
2

E:\Dhanajava>