public class TestBankAccount
{
	public static void main(String[] args)
	{
		BankAccount ba1 = new BankAccount();
		ba1.addMoney("checking",15.5);
		ba1.addMoney("saving",40.0);

		ba1.withdrawMoney("checking",0.5);
		ba1.printStatement("checking");
		ba1.printStatement("saving");
		//ba1.generateAccountNumber();
	}


}
