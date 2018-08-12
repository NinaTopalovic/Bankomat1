
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		Bank bank=new Bank();
		
		System.out.println("\t\t\t\t*DOBRODOSLI U BANKU*");
		System.out.println();
		System.out.println("\t\t\t\t\t-MENU-");
		System.out.println();
		System.out.print("1. Kreiraj racun \t");
		System.out.print("2. Transfer novca \t");
		System.out.print("3. Uplata novca \t");
		System.out.print("4. Informacije o racunima \t");
		System.out.println("5. Izlaz");
		System.out.println();
		System.out.print("Koju opciju zelite izabrati: ");

		
		input.nextLine();
	
		for(int i=0; i<100000; i++) {
			
			
		int user=input.nextInt();
		
		if(user==1) {
			System.out.print("Unesite svoje ime: ");
			String userName=input.nextLine();
			bank.createAccount(userName);
			System.out.print("Koju opciju sada zelite izabrati?");
			user=input.nextInt();
			input.nextLine();
			}
		
		else if(user==2) {
				System.out.println("Unesite potrebne podatke za transakciju: ");
				System.out.print("Broj racuna sa kojeg prebacujete novac: ");
				int id1=input.nextInt();
				System.out.print("Broj racuna na koji prebacujete novac: ");
				int id2=input.nextInt();
				System.out.print("Iznos novca koji prebacujete: ");
				double amount=input.nextDouble();
				while(amount<0) {
					System.out.println("Iznos koji prebacujete mora biti veci od 0!");
					System.out.println("Ponovo unesite iznos novca koji prebacujte: ");
					amount=input.nextDouble();
				}
				bank.transfer(id1, id2, amount);
				System.out.print("Koju opciju sada zelite odabrati: ");
				user=input.nextInt();
				input.nextLine();
			}
		
		else if(user==3){
			System.out.println("Unesite potrebne podatke za uplatu: ");
			System.out.print("Broj racuna na koji uplacujete: ");
			int id=input.nextInt();
			System.out.print("Iznos novca koji uplacujete: ");
			double amount=input.nextDouble();
			while(amount<0) {
				System.out.println("Iznos koji uplacujete mora biti veci od 0!");
				System.out.println("Ponovo unesite iznos novca koji uplacujete: ");
				amount=input.nextDouble();
			}
			bank.deposit(id, amount);
			System.out.print("Koju opciju sada zelite odabrati: ");
			user=input.nextInt();
			input.nextLine();
			
		}
		else if(user==4) {
			bank.information();
			break;
			
		}
		else if(user==5) {
			System.out.println();
			System.out.println("*HVALA STO STE KORISTILI NASU BANKU*");
			break;
		}
		else {
			System.out.println();
			System.out.println("Takva opcija ne postoji!");
			break;
		}
		
			}
		
		
		
	}
	}

