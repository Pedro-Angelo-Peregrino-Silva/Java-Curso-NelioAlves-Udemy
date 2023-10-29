package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountClient;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AccountClient accountClient = new AccountClient();
		
		System.out.print("Enter account number: ");
		accountClient.setAccountNumber(sc.nextInt());
		
		System.out.print("Enter account holder: ");
		accountClient.setAccountHolder(sc.nextLine());
		
		System.out.print("Is there an initial deposit (y/n)? ");
		accountClient.setInitialDeposit(sc.next().charAt(0));
		
		if(accountClient.getInitialDeposit())
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Account data:");
		
		
	}

}
