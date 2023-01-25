import java.util.ArrayList;

public class item {
	
	   Invoice in = new Invoice();
	    ArrayList<Invoice> invoiceList = new  ArrayList<Invoice>();
	    
		private int itemId;
	    private String itemName;
	    private double unitPrice;
	    private int quantity;
	    private double qtyAmount;
	    private int numberOfItems;
	    private double paidAmount;
	    
    public double getPaidAmount() {
			return paidAmount;
		}
		public void setPaidAmount(double paidAmount) {
			this.paidAmount = paidAmount;
		}
	public int getNumberOfItems() {
			return numberOfItems;
		}
		public void setNumberOfItems(int numberOfItems) {
			this.numberOfItems = numberOfItems;
		}
	public int getItemId() {
			return itemId;
		}
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getQtyAmount() {
			return qtyAmount;
		}
		public void setQtyAmount(double qtyAmount) {
			this.qtyAmount = qtyAmount;
		}


    
 
     
	

    
}
