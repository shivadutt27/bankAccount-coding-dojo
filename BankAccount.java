public class BankAccount
{
	private double checkingBalance;
	private double savingBalance;

	private static int numOfAccounts;

	private static double totalMoney;

	private String accountNumber;

	public BankAccount()
	{
		this.checkingBalance = 0.0;
		this.savingBalance = 0.0;
		numOfAccounts++;
		generateAccountNumber();
	}

	 


	private void generateAccountNumber()
	{
		String[] strArr = {"0","1","2","3","4","5","6","7","8","9"};
	
		String [] newArr = new String[10];
	
		for(int i=0; i<strArr.length; i++)
		{
			int index = (int) (Math.random()*10);
			newArr[i] = strArr[index];

		} 
		
		StringBuffer sb = new StringBuffer();
		for(String ch: newArr)
		{
			sb.append(ch);
		}
		
		String str = sb.toString();	
		System.out.println(str);
		
	}

	private double getSavingBalance()
	{
		return this.savingBalance;
	}

	private double getCheckingBalance()
	{
		return this.checkingBalance;
	}

	public void addMoney(String accountType, double amount)
	{
		if(accountType.equalsIgnoreCase("checking"))
		{
			this.checkingBalance+=amount;
			totalMoney+=amount;
		}
		else if(accountType.equalsIgnoreCase("saving"))
		{
			this.savingBalance+=amount;
			totalMoney+=amount;
		}
		else{
			System.out.println("Account name is not correct");
		}
	}

	
        public void withdrawMoney(String accountType, double amount)
        {
                if(accountType.equalsIgnoreCase("checking"))
                {
                        this.checkingBalance-=amount;
                        totalMoney-=amount;
                }
                else if(accountType.equalsIgnoreCase("saving"))
                {
                        this.savingBalance-=amount;
                        totalMoney-=amount;
                }
                else{

                        System.out.println("Account name is not correct");
                }
        }

	
	public void printStatement(String accountType)
	{
		
                if(accountType.equalsIgnoreCase("checking"))
                {
                        System.out.println(getCheckingBalance());
                }
                else if(accountType.equalsIgnoreCase("saving"))
                {
                        System.out.println(getSavingBalance());
                }
                else{

                        System.out.println("Account name is not correct");
                }
	}









}
