import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

	ArrayList<Shop> shoplist = new ArrayList<Shop>();

	public static void main(String[] args) {
		{
			item it = new item();
			Shop sh = new Shop();
            boolean condation = true ;
			Scanner sc = new Scanner(System.in);
			while(condation)
			{
			System.out.println("---------Welcome To Our System---------");
			System.out.println("\npress 1: to Join in Shop Settings");
			System.out.println("press 2: to Manage Shop Items");
			System.out.println("press 3: to Create New Invoice");
			System.out.println("press 4: to Report:View Statistics of Report ");
			System.out.println("press 5: to Report:To view All Invoices");
			System.out.println("press 6: to Search (1)Invoice");
			System.out.println("press 7: to Program Statistics");
			System.out.println("press 8: to Exit");

			System.out.println("Select the number please");
			int Menu = sc.nextInt();
			Invoice in = new Invoice();
			  boolean condation1 = true ;
			switch (Menu) {
			case 1:
				
				while(condation1)
				{
				System.out.println("-------- Shop Settings --------");
				System.out.println("1- Load Data (Items and invoices)");
				System.out.println("2- Set Shop Name (data should be saved)");
				System.out.println("3- Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved) ");
				System.out.println("4- Go Back");
				System.out.println("Please choose number");
				int Menu1 = sc.nextInt();
				
				
				switch (Menu1) {
				case 1:
					
					break;
				
				case 2:
					System.out.println("Enter the Shop Name");
					String b1 =sc.next();
					sh.setShopName(b1);

					break;

				case 3:
					System.out.println("Set Invoice Header");
					System.out.println("\nEnter Tel number:");
					int c1 =sc.nextInt();
					sh.setTel(c1);
					
					System.out.println("Enter Fax number:");
					String c2= sc.next();
					sh.setFax(c2);
					
					System.out.println("Enter the Email:");
					String c3 =sc.next();
					sh.setEmail(c3);
					
					System.out.println("Enter Website");
					String c4 =sc.next();
					sh.setWebsite(c4);
					break;
				    case 4:
				    	condation1 = false ;

					break;
				}
				}
				
				
			case 2:
				System.out.println("Manage Shop Items");
				
				break;
			case 3:
				System.out.println("Create New Invoice");
				System.out.println("Enter thr Customer Full Name:");
				String a1 = sc.next();
				in.setCustomerFullName(a1);
				System.out.println("Enter the Customer PhoneNumber:");
				int a2 = sc.nextInt();
				in.setCustomerPhoneNumber(a2);
			

				break;
			case 4:
				System.out.println("Report Statistics");
				break;
			case 5:
				System.out.println("Report All Invoices");
				break;
			case 6:
				System.out.println("Search (1) Invoice");
				break;
			case 7:
				System.out.println("Program Statistics");
				break;
			case 8:
				System.out.println("Exit");
				break;
			default:

			}

		}
		}
	}
}
