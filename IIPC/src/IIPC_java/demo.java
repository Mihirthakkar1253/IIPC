package IIPC_java;

import Account;

public class demo {
	
		public static void main(String[]args) {
			Account ac1=new Account();
			ac1.setName("xyz");
		   ac1.deposite(10000);
		   System.out.println(ac1.getBalance());
		   ac1.withdraw(1000);
		   System.out.println(ac1.getBalance());
		   

			
		}
	
}
