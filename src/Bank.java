import java.util.ArrayList;

public class Bank {
	
ArrayList<Account> listOfAccounts=new ArrayList<>();
	
	public void createAccount(String user) {
		
		Account account=new Account(user);
		
		int size=listOfAccounts.size();
		
		if(size==0) {
			account.setIdOfAccount(100);
			account.setAmount(0.0);
			listOfAccounts.add(account);
		}
		else {
			Account last=listOfAccounts.get(size-1);
			
			int lastId=last.getIdOfAccount();
			int nextId=lastId+1;
			account.setIdOfAccount(nextId);
			account.setAmount(0.0);
			listOfAccounts.add(account);
			
		}
	}
	
	public void transfer(int sourceAccount, int targetAccount, double amount) {
		
		int size=listOfAccounts.size();
		boolean condition=false;
		boolean transfer=false;
	
		for(int i=0; i<size; i++) {
			Account account=listOfAccounts.get(i);
			if(targetAccount==account.getIdOfAccount()) {
				condition=true;
			}
			else {
				System.out.println("Racun na koji pokusavate na prebacite novac ne postoji!");
				break;
			}
		}
		for(int i=0; i<size; i++) {
			Account account=listOfAccounts.get(i);
			if(sourceAccount==account.getIdOfAccount() && condition==true) {
				if(account.getAmount()>=amount) {
					double newAmount=account.getAmount()-amount;
					account.setAmount(newAmount);
					transfer=true;
					}
				else {
					System.out.println("Na racunu nema dovoljno novca za ovu transakciju!");
				}
			}
			else {
				System.out.println("Racun sa kojeg pokusavate da prebacite novac ne postoji!");
			}
		}
		for(int i=0; i<size; i++) {
			Account account=listOfAccounts.get(i);
			if(targetAccount==account.getIdOfAccount()) {
				double newAmount=account.getAmount()+amount;
				account.setAmount(newAmount);
			}
		
		
		
	}
	
	
}
	public void deposit(int targetAccount, double amount) {
		
		int size=listOfAccounts.size();
		for(int i=0; i<size; i++) {
			Account account=listOfAccounts.get(i);
			if(targetAccount==account.getIdOfAccount()) {
				account.setAmount(amount);
			}
		
	}
	}
	public void information(String name) {
		int size=listOfAccounts.size();
		for(int i=0; i<size; i++) {
			Account account=listOfAccounts.get(i);
			if(account.getUser().equals(name)) {
			
			System.out.println();
			System.out.println("Broj racuna: " + account.getIdOfAccount());
			System.out.println("Vlasnik racuna: " + account.getUser());
		    System.out.println("Iznos na racunu: " + account.getAmount());
		    System.out.println();
			}
		}
		
	}

}
