import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Invoice {

	private String customerFullName;
	public int CustomerPhoneNumber;
	private String invoiceDate;
	private double totalAmount;
	private double balance;
	public String getCustomerFullName() {
		return customerFullName;
	}
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	public int getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		CustomerPhoneNumber = customerPhoneNumber;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * public void setInvoiceHeader() {
	 * System.out.println("Enter full name please:"); CustomerFullName = sc.next();
	 * 
	 * System.out.println("Enter the your phone number"); phoneNumber =
	 * sc.nextInt();
	 * 
	 * System.out.println("Enter the invoice Date"); invoiceDate = sc.next();
	 * 
	 * System.out.println("Enter the number of Items"); numberOfItems =
	 * sc.nextInt();
	 * 
	 * item it = new item();
	 * 
	 * System.out.println("Enter the item Id"); it.setItemId(sc.nextInt());
	 * 
	 * System.out.println("Enter the item Name"); it.setItemName(sc.next());
	 * 
	 * System.out.println("Enter unitPrice"); it.setUnitPrice(sc.nextDouble());
	 * 
	 * System.out.println("Enter quantity"); it.setQuantity(sc.nextInt());
	 * 
	 * System.out.println("Enter the qtyAmount"); it.setQtyAmount(sc.nextDouble());
	 * 
	 * try { FileOutputStream file = new FileOutputStream("Invoice.txt");
	 * ObjectOutputStream out = new ObjectOutputStream(file);
	 * out.writeObject(CustomerFullName); out.writeObject(phoneNumber);
	 * out.writeObject(invoiceDate); out.writeObject(numberOfItems);
	 * 
	 * out.close(); file.close(); System.out.println("serialized and saved"); }
	 * catch (Exception e) { e.printStackTrace();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public String getCustomerFullName() { return CustomerFullName; }
	 * 
	 * public void setCustomerFullName(String customerFullName) { CustomerFullName =
	 * customerFullName; }
	 * 
	 * public int getPhoneNumber() { return phoneNumber; }
	 * 
	 * public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber;
	 * }
	 * 
	 * public String getInvoiceDate() { return invoiceDate; }
	 * 
	 * public void setInvoiceDate(String invoiceDate) { this.invoiceDate =
	 * invoiceDate; }
	 * 
	 * public int getNumberOfItems() { return numberOfItems; }
	 * 
	 * public void setNumberOfItems(int numberOfItems) { this.numberOfItems =
	 * numberOfItems; }
	 * 
	 * public boolean isTotalAmount() { return totalAmount; }
	 * 
	 * public void setTotalAmount(boolean totalAmount) { this.totalAmount =
	 * totalAmount; }
	 * 
	 * public boolean isPaidAmount() { return paidAmount; }
	 * 
	 * public void setPaidAmount(boolean paidAmount) { this.paidAmount = paidAmount;
	 * }
	 * 
	 * public boolean isBalance() { return balance; }
	 * 
	 * public void setBalance(boolean balance) { this.balance = balance; }
	 */

}
