import java.util.Scanner;
public class bai6{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("numbe\tsquare\tcube\n");
		
		for( i = 0; i <= 10 ; i++)
			System.out.printf("%d\t%d\t%d\n",i,i*i,i*i*i);

	
	}
}