import java.util.Scanner;
public class bai7{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int i, soduong = 0, soam = 0,sokhong = 0;
		int []a = new int [5];

		for( i = 1; i <= 5 ;i++){
			System.out.printf("So thu %d : ",i);
			a[i] = 	input.nextInt();
		}
		for(i = 0; i<5 ; i++){
			if( a[i] > 0 ) soduong ++;
			else if ( a[i] < 0 ) soam ++;
			else  sokhong ++;
		}
		System.out.printf("So cac so duong : %d\n",soduong);
		System.out.printf("So cac so am : %d\n",soam);
		System.out.printf("So cac so khong : %d\n",sokhong);
	}
}