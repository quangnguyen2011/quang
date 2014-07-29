// 8.5
import java.util.Scanner;

public class Time2Test
{
	public static void main( String []args )
	{
		Scanner input = new Scanner( System.in);
		Time2 Time21 = new Time2();
		Time2 Time22 = new Time2( 12 );
		Time2 Time23 = new Time2( 15 , 23 , 12);

		System.out.printf("%s\n", Time21.toString());
		System.out.printf("%s\n", Time22.toString());
		System.out.printf("%s", Time23.toString());
	}
}