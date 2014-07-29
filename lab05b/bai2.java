import java.util.Scanner;
 
public class bai2 {
public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        int a, b, c;
        int tong, tich;
        int TBC;
        
        System.out.print("nhap so thu 1 ");
        a = input.nextInt();
        System.out.print("nhap so thu 2 ");
        b = input.nextInt();
        System.out.print("nhap so thu 3 ");
        c = input.nextInt();
 
        tong = a + b + c;
        tich = a * b * c;
        TBC = tong / 3;
  
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        int min = (a < b) ? a : b;
        min = (min< c) ? min : c;
 
        System.out.printf("Tong la %d\n", tong);
        System.out.printf("Tich la %d\n", tich);
        System.out.printf("TBC la %f\n", TBC);
        System.out.printf("So lon nhat la %d\n", max);
        System.out.printf("So nho nhat la %d\n", min);
}
}