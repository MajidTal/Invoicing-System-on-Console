import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		{
		Scanner sc = new Scanner(System.in);
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

		switch (Menu) {
		case 1:
			System.out.println("1- Shop Settings");
			System.out.println("2- Load Data (Items and invoices)");
			System.out.println("3- Set Shop Name (data should be saved)");
			System.out.println("4- Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved) ");
			System.out.println("5- Go Back");
			System.out.println("Please choose number"); 
			int Menu1 = sc.nextInt();
			switch (Menu1) {
			case 1:
			System.out.println(" Load Data");	
			break;
			case 2:
				System.out.println(" Set Shop Name");	
				break;
				
			case 3:
				System.out.println("Set Invoice Header");	
				break;
				
			case 4:
				System.out.println(" Go Back");	
				break;
				
			}
		
			break;
		case 2:
			System.out.println("Manage Shop Items");
			break;
		case 3:
			System.out.println("Create New Invoice");
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
	}}

