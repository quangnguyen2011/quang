//import java.util.Scanner;

public class bai8a{
	public static void main(String args[]){
		//Scanner input = new Scanner(System.in);
		int i,j,k;
	
		for( i = 1 ; i <= 8 ; i++){
			for( j = 1; j <= i; j++ )
			System.out.printf("* ");
			for( k = i; k <= 8 ; k++)
			System.out.printf(" ");
			System.out.printf("\n");
		}
	}
}