import java.util.Scanner;
//8.8

public class DateTest
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		
		Date p = new Date (12,31,1992);
		System.out.printf ("The NextDay is: ");
		
		System.out.printf("%s\n", p.nextDay());
		
	}
}