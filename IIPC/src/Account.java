
public class Account {
	  private int withdraw;
	   private int balance;
	   private String name;
	
	   public int getBalance(){
	       return balance;
	   }
//	   public void setBalance(int val){
//	       balance=val;
//	   }
	   public void setName(String name) {
		  this.name=name;
	   }
	   public String getName() {
		   return this.name;
	   }
	   public void withdraw(int amount){
	       if(balance-amount>1000){
	    	   balance=balance-amount;
	           System.out.println("ammount withrawed");
	           
	       }
	       else{
	           System.out.println("eneter valid amount");
	       }

	   }
	   public void deposite(int value) {
		   balance=balance+value;
		   System.out.println("sucess");
	   }
}

