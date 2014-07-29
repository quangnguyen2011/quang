// Bai 1
import people.*;
import java.util.Scanner;

public class PeopleTest{
 public static void main(String[] avgs){
	Employee newbie = new Employee("Newbie", new Date(10,2,1989), 1000000);
	Manager boss = new Manager("Boss", new Date(23,2,1979), 4000000);
	boss.setAssistant(newbie);
	Manager bigBoss = new Manager("Big Boss", new Date(3,12,1969), 10000000);
	bigBoss.setAssistant(boss);
	System.out.println(newbie.toString());
	System.out.println(boss.toString());
	System.out.println(bigBoss.toString());
	}
	}