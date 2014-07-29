import java.util.Scanner;

public class bai4 {
        public static void main(String args[]){
              Scanner input = new Scanner( System.in );
              //double PI = Math.PI;
	          int r;
              
	          System.out.print("r = ");
	          r = input.nextInt();
 
	          System.out.printf("Diameter = %d \n",2*r);
	          System.out.printf("Circumference = %.5f \n", 2*r*Math.PI);
              System.out.printf("Area = %.5f\n",r*r*Math.PI); 
        }
}