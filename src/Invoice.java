
public class Invoice {
private String CustomerFullName;
private int phoneNumber;
private String invoiceDate;
private int numberOfItems;
private boolean totalAmount;
private boolean paidAmount;
private boolean balance;
public String getCustomerFullName() {
	return CustomerFullName;
}
public void setCustomerFullName(String customerFullName) {
	CustomerFullName = customerFullName;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getInvoiceDate() {
	return invoiceDate;
}
public void setInvoiceDate(String invoiceDate) {
	this.invoiceDate = invoiceDate;
}
public int getNumberOfItems() {
	return numberOfItems;
}
public void setNumberOfItems(int numberOfItems) {
	this.numberOfItems = numberOfItems;
}
public boolean isTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(boolean totalAmount) {
	this.totalAmount = totalAmount;
}
public boolean isPaidAmount() {
	return paidAmount;
}
public void setPaidAmount(boolean paidAmount) {
	this.paidAmount = paidAmount;
}
public boolean isBalance() {
	return balance;
}
public void setBalance(boolean balance) {
	this.balance = balance;
}




}
