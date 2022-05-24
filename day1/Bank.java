package week4.day1;

public class Bank extends SbiItLoan implements Pnb,Cibil{

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("maximumLoanAmount");
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("bankBalance");
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("creditScore");
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("miniumBalance");
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("cibilScore");
	}
public static void main(String[] args) {
	Bank data=new Bank();
	data.maximumLoanAmount();
	data.bankBalance();
	data.creditScore();
	data.minimumBalance();
	data.cibilScore();
	data.itLoan();
}
}
