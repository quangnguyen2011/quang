import java.util.Scanner;

public class Time2ImproveTest
{
	public static void main( String []args )
	{
		Scanner input = new Scanner( System.in);
		
		Time2Improve Time = new Time2Improve( 45 , 23 , 12);

		System.out.printf("%s\n", Time.toString());
		
	}
}