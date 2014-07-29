public class SavingsAccount
{
    private double savingsBalance, annualInterestRate;
     // constructor
    public SavingsAccount( double saveBalance, double annualInterestRateNew )
    {
		annualInterestRate = annualInterestRateNew;
		savingsBalance = saveBalance;
    } 
	public void setSavingsBalance(double saveBalance)
	{
		savingsBalance = saveBalance;
	}
    public double getSavingsBalance()
    {
        return savingsBalance; 
    }
	public void modifyInterestRate( double annualInterestRateNew )
	{
		annualInterestRate = annualInterestRateNew;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public double calculateMonthlyInterest()
	{
		return (getSavingsBalance() * getAnnualInterestRate()) / 12;
	}
	
} // end class SavingsAccount