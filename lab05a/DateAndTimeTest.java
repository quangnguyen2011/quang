import java.util.Scanner;

public class DateAndTimeTest
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		Date d = new Date(11,1,1992);
		DateAndTime time = new DateAndTime( 23 , 59 , 59 , d);
		
		System.out.println(time);
	}
}