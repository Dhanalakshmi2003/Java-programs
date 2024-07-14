// skillset program
import java.util.Scanner;
class  trainer
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the skillset: ");
		System.out.println("1.java \n 2. sql");
		int skill=sc.nextInt();
		switch(skill)
		{
			case 1:
			{
				System.out.println("select java trainer: ");
				System.out.print("1.Tabrez\n2.shambu\n3.Nandhini");
				int java_trainer=sc.nextInt();
				switch(java_trainer)
				{// java page
					case 1:
					{
						System.out.println("your java trainer is tabrez");
						break;
					}
					case 2:
					{
						System.out.println("your java trainer is shambu");
						break;
					}
					case 3:
					{
						System.out.println("your java trainer is Nandhini");
						break;
					}
					default:
					{
						System.out.println("Invalid java trainer");
						break;
					}
				}
				
				break;
			}// java page

			case 2:
			{// sql page
				System.out.println("select SQL trainer: ");
				System.out.print("1.Nagaraj\n2.Bharath\n3.Neeraj");
				int sql_trainer=sc.nextInt();
				switch(sql_trainer)
				{
					case 1:
					{
						System.out.println("your sql trainer is Nagarj");
						break;
					}
					case 2:
					{
						System.out.println("your java trainer is Bharath");
						break;
					}
					case 3:
					{
						System.out.println("your java trainer is Neeraj");
						break;
					}
					default:
					{
						System.out.println("Invalid sql trainer");
						break;
					}

				}
				break;
			}// sql page
			default:
					{
						System.out.println("invalid skillset");
						break;
					}	
				
		}
	}
}