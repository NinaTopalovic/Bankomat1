
public class Account {

	int idOfAccount;
	String user;
	double amount;
	
	public Account() {
		
	}
	public Account(String user) {
		this.user=user;
	}
	public int getIdOfAccount() {
		return idOfAccount;
	}
	public void setIdOfAccount(int idOfAccount) {
		this.idOfAccount = idOfAccount;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}


