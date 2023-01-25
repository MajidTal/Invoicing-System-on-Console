import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	item it = new item();
	ArrayList<item> itemList = new ArrayList<item>();
	   Invoice in = new Invoice();
		ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();

	Scanner sc = new Scanner(System.in);

	private String ShopName;
	private int Tel;
	private String Fax;
	private String Email;
	private String Website;

	
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		Tel = tel;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}


	public void AddItem() {
		System.out.println("Enter item id:");
		int a3 = sc.nextInt();
		it.setItemId(a3);
		System.out.println("Enter item Name:");
		String a4 = sc.next();
		it.setItemName(a4);
		System.out.println("Enter the unit Price");
		double a5 = sc.nextDouble();
		it.setUnitPrice(a5);
	
		System.out.println("Enter the Number Of Items");
		int a7 = sc.nextInt();
		it.setNumberOfItems(a7);
		
		
		System.out.println("Enter paid Amount:");
		double a8 = sc.nextDouble();
		it.setPaidAmount(a8);
		
		
		
		itemList.add(it);
	}

	public void deleteItems()
	{
		System.out.println("which item do you want to deleted");
		int deItem =sc.nextInt();
		itemList.remove(deItem); 
			
		
	}

	public void changeItemPrice() {
		
	}
        
	public void reportAllItems() {
		System.out.println("---------- Items Report ----------");
		for (item a : itemList) {
			System.out.println("----------------------------------");
			System.out.println("Item Name : " + a.getItemName());
			System.out.println("Item ID : " + a.getItemId());
			System.out.println("Item Quantity : " + a.getQuantity());
			System.out.println("Item UnitePrice : " + a.getUnitPrice());
			System.out.println("Item Quantity Amount Price : " + a.getQtyAmount());

		}
		System.out.println("----------------------------------");
	}

	
}
