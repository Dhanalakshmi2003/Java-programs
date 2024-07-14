import java.util.Scanner;
class Swiggy 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO SWIGGY APPLICATION");
		System.out.println("Select your favourite hotel for food hunt");
		System.out.println("1.Buhari\n2.A2b\n3.cake forest\n4.SS hyderabad");
		int hotel=sc.nextInt();
		switch(hotel)
		{
			case 1:
				{//buhari
				 System.out.println("Welcome to Buhari hotel");
                 System.out.println("Enter your favourite food: ");
				 System.out.println("1.Mutton biriyani\n2.chicken biriyani\n3.chicken 65\n4.fish meals");
				 int food=sc.nextInt();
				 switch(food)
					{
					 case 1:
						 {//mutton biriyani
						 System.out.println("Your yummy mutton biriyani is ready");
						 int price=380;
						 System.out.println("price: "+price);
						 System.out.print("Enter the Quantity: ");
						 int qty=sc.nextInt();
						 double total_bill=price*qty;
						 System.out.println("..Processing...");
						 Thread.sleep(3000);
						 System.out.println("Total bill amount: "+total_bill);
						 System.out.println("Select the payment method: ");				 
						 System.out.println("1.gpay\n2.phonepe");
						 double pay=sc.nextDouble();
						 int payment=sc.nextInt();
						 if(payment==1)
							 {//gpay mode
							 System.out.println("Welcome to gpay");
							 System.out.println("enter the bill amount: ");
                             double user_entered_bill=sc.nextDouble();
							 if(total_bill==user_entered_bill)
								 {// bill and otp validation
								 System.out.println("your bill is matching");
								 System.out.println("Generate otp: ");
								 int sys_otp=(int)(Math.random()*9999+9999);
								 Thread.sleep(2000);
								 System.out.println(sys_otp);
								 System.out.println("Re enter otp: ");
								 int otp=sc.nextInt();
								 if(sys_otp==otp)
									 {
									 System.out.println("Otp matched");
									 System.out.println("procesing......");
									 Thread.sleep(3000);
									 System.out.println("Congratulations! youre order placed. Enjoy eating");
									 }
								 else
									 {
									 System.out.println("Sorry! cannot match otp.. order failed.");
									 }
								 }
							 else
								 {
								 System.out.println("your bill is not matching");
								 }
							 }//gpay
						 break;
						 }
					 case 2:
						 {//chicken biriyani
						 break;
						 }
					 case 3:
						 {//chicken 65
						 break;
					     }
					 case 4:
						 {//fish meals
						 break;
						 }
				     default:
						{
						 // invalid buhari food
						 break;
						 }
					}

				break;
				
				}//buhari
			case 2:
				{//A2b
				break;
				}//A2b
			case 3:
				{//cake forest
				break;
			    }//cake forest
			case 4:
				{// ss hyderabad biriyani
				break;
				}//ss hyderabad biriyani
		}
        
	}
}
