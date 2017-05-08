package com.christineyi;

public class Main {

    public static void main(String[] args) {
		Account user = new Account(1, 0, "Christine", "chris@cool.com", "555-123-0099");
	//	user.setAccountNumber(1);
	//	user.setBalance(100.00);
	//	user.setCustomerName("Christine");
	//	user.setEmail("christine@cool.com");
	//	user.setPhoneNumber("123-456-7890");

		System.out.println("User details: " +
			" Account number: " + user.getAccountNumber() +
			" Balance: " + user.getBalance() +
			" Customer name: " + user.getCustomerName() +
			" Email: " + user.getEmail() +
			" Phone Number: " + user.getPhoneNumber()
		);

		user.deposit(100);
		user.withdraw(300);

		Account secondUser = new Account();
		secondUser.getPhoneNumber();

		Vip hans = new Vip();
		System.out.println(hans.getName());
		Vip bob = new Vip("bob", 2500.0);
		System.out.println(bob.getName());
		Vip jack = new Vip("jack", 100.09, "jack@gmail.com");
		System.out.println(jack.getName());
	}
}
