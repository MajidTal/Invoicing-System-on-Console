import java.util.ArrayList;

public class Shop {
	ArrayList<item> itemList = new ArrayList<item>();
	 ArrayList<Invoice> invoiceList = new  ArrayList<Invoice>();
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
	private int Tel; 
	 private String Fax; 
	 private String Email;
	 private String Website;
	 
	 
	 
}
