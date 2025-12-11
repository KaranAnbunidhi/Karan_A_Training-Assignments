package oops;

class BankAccount{
	
	private long accNo;
	private float balance;
	
	public void setaccNo(long accNo) {
		this.accNo=accNo;
	}
	public long getaccNo() {
		return accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount=new BankAccount();
		bankAccount.setaccNo(75546374);
		bankAccount.setBalance(125000.34f);
		System.out.println("Account Number: "+bankAccount.getaccNo());
		System.out.println("Account Balance: Rs."+bankAccount.getBalance());
        
	}

}
