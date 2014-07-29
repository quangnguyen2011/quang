import java.util.Scanner;

public class SavingsAccountTest
{
    // main method begins execution of Java application
    public static void main( String args[] )
    {
		Scanner input = new Scanner( System.in );
		
        SavingsAccount account1 = new SavingsAccount( 2000.00 , 0.04 ); // create Account object
        SavingsAccount account2 = new SavingsAccount( 3000.00 ,0.04 );// create Account object
		
        System.out.printf( "Save account1 :$%.2f\n",account1.getSavingsBalance() );
        System.out.printf( "Save account2 :$%.2f\n\n",account2.getSavingsBalance() );

        // create Scanner to obtain input from command window
        
		//System.out.printf("%.2f\n",account1.getAnnualInterestRate());
		System.out.printf( "MonthlyInterest of account1 : $%.2f\n", account1.calculateMonthlyInterest() );
		System.out.printf( "MonthlyInterest of account2 : $%.2f\n", account2.calculateMonthlyInterest() );
		
		System.out.printf("Save account1 in next year : %.2f\n",account1.calculateMonthlyInterest() * 12 + account1.getSavingsBalance() );
		System.out.printf("Save account2 in next year : %.2f\n\n",account2.calculateMonthlyInterest() * 12 + account2.getSavingsBalance() );
		
		account1.modifyInterestRate( 0.05 );
		account2.modifyInterestRate( 0.05 );
		
		System.out.printf("New annualInterestRate : %.2f\n",account1.getAnnualInterestRate());
		System.out.printf( "MonthlyInterest of account1 : $%.2f\n", account1.calculateMonthlyInterest() );
		System.out.printf( "MonthlyInterest of account2 : $%.2f\n", account2.calculateMonthlyInterest() );
		
		System.out.printf("Save account1 in next year : %.2f\n",account1.calculateMonthlyInterest() * 12 + account1.getSavingsBalance() );
		System.out.printf("Save account2 in next year : %.2f\n",account2.calculateMonthlyInterest() * 12 + account2.getSavingsBalance() );
    } // end main
} 
