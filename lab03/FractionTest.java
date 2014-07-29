
import java.util.Scanner;

public class FractionTest 
{
    public FractionTest()
    {
        
    }
    public static void main(String args[] )
    {
		Fraction f0 = new Fraction(0,0);
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(2,4);
	/*	Fraction f3 = new Fraction (1, 1);
		Fraction f4 = new Fraction (3, 1);
		Fraction f5 = new Fraction (1, -3);
		Fraction f6 = new Fraction (25, 5); 
		Fraction f7 = new Fraction (30, 66);*/
		Fraction sum = f1.plus(f2);
		sum.display(); 
		f2.reduce();
		f1.display(); f2.display();
		
	/*	f3.reduce(); f4.reduce(); f5.reduce(); f6.reduce(); f7.reduce();
		f3.display();f4.display();f5.display();f6.display();f7.display(); */
    }
}
