
import java.util.Scanner;
public class Fraction {
   
    private int numerator;
    private int denumerator;
        
    public  Fraction(int a, int b){
        if(b!=0){
        numerator = a;
        denumerator = b;
		}
		else {
		System.err.printf("Error denumerator is 0 \n");
		numerator = 1;
		denumerator = 1;
		}
    }
    
    public void display(){
        System.out.printf("%d/%d \n",numerator,denumerator);
    }
        
	public void reduce(){
	int divider = 2 ;
	while(numerator >= divider && denumerator >= divider){	
	if (numerator % divider == 0 && denumerator % divider == 0){
			numerator = numerator / divider;
			denumerator = denumerator / divider;
			divider ++ ;
			}
	}
    }
	
	public Fraction plus(Fraction f2){
		Fraction sum = new Fraction(1, 1);
		sum.numerator = ((this.numerator)*f2.denumerator) + ((this.denumerator)*f2.numerator);
		sum.denumerator = (this.denumerator)*f2.denumerator;
		return sum;
		}
    }

