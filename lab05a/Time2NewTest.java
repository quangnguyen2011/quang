import java.util.Scanner;
// 8.7

public class Time2NewTest
{
	public static void main( String []args )
	{
		Scanner input = new Scanner( System.in);
		Time2New Time21 = new Time2New(23 , 59 , 59);
		Time2New Time22 = new Time2New( 12 , 59 , 59 );
		Time2New Time23 = new Time2New( 1 , 59 , 59);

		System.out.printf("%s\n", Time21.tick());
		System.out.printf("%s\n", Time23.tick());
		System.out.printf("%s\n", Time21.incrementMinute());
		System.out.printf("%s", Time21.incrementHour());
	}
}