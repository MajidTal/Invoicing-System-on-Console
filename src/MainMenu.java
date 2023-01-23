import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {

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
			System.out.println("Shop Settings");
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
			
			System.out.println("Not a valid Number.Choose from ( 1 to 8) ");
			System.out.println("Enter the number again");
			int b = sc.nextInt();

		}

	}

}
