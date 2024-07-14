// Application program
import java.util.*;
class Application
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Enter the Application: ");
		System.out.println("1.Facebook\n2.Instagram");
		Scanner sc=new Scanner(System.in);
		int app=sc.nextInt();
		switch(app)
		{
			case 1:
			{// fb application
				System.out.println("Welcome to facebook");
				System.out.println("Enter values:\n1.Email id\n2.password\n3.change password");
				int fb_validation=sc.nextInt();
				String email="dhanagopi03@gmail.com";
				int pwd=123456;
				switch(fb_validation)
				{
					
					case 1:
					{
						System.out.println("Facebook email id:"+email);
						break;
					}
					case 2:
					{
						System.out.println("facebook password:"+pwd);
						break;
					}
					case 3:
					{
						System.out.println("password change: ");
						System.out.println("old password: "+pwd);
						System.out.print("Enter new password(otp): ");
						Thread.sleep(3000);
						int  Sys_otp=(int)(Math.random()*9999+9999);
						System.out.println(Sys_otp);
						System.out.println("Re enter the password: ");
						int password=sc.nextInt();
						System.out.println("....processing.............");
						Thread.sleep(2000);

						if(Sys_otp==password)
						{
							System.out.println("Password changed successfully");
							System.out.println("current password: "+password);
						}
						else
						{
							System.out.println("invalid password");
						}
						break;
					}
					default:
					{
						System.out.println("invalid facebook settings");
						break;
					}
				}

				break;
			}// fb application


			case 2:
			{
				System.out.println("Welcome to instagram");
				System.out.println("Enter values:\n1.username\n2.password\n3.change password");
				break;
			}
			
		}
	}
}
