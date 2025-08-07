
public class BankAccount {
private double bankBalance = 50000;
public void withdraw(double amt) {
	System.out.println("Withdrawing!");
	bankBalance -= amt;
	//bankBalance-=1;
}
public double getBankBalance() {
	return bankBalance;
}
public void setBankBalance(double bankBalance) {
	this.bankBalance = bankBalance;
}

}
