import java.util.Scanner;
public class bai9{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int []a = new int [100];
		int i,j,temp;

		for( i = 1; i <= 20 ;i++){
			System.out.printf("So thu %d : ",i);
			a[i] = 	input.nextInt();
		}
		for( i = 1; i <= 20 ;i++)
		for( j = i+1; j <= 20 ;j++){
			if( a[i] > a[j]){
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
			if( a[i] == 0) break;
		}
	
		for( i= 1; i <= 20 ;i++)
		System.out.printf(" %d\n",a[i]);
	}
}