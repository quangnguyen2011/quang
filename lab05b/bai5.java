import java.util.Scanner;

public class bai5{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
                int n;
		
                System.out.println("n = ");
		n = input.nextInt();

		System.out.printf("%d\t",n/10000);
		
		System.out.printf("%d\t",(n%10000)/1000);
		System.out.printf("%d\t",((n%10000)%1000)/100);
		System.out.printf("%d\t",(((n%10000)%1000)%100)/10);
		System.out.printf("%d\t",(((n%10000)%1000)%100)%10);
	}
}