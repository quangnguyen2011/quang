// Bai 1
package people;
import java.util.Scanner;

public class Person{
	private String name;
	private Date birthday;
	public Person(String ten, Date sn){
		name = ten;
		birthday = sn;
		}

	public String getName(){
	 return name;
	 }
	 
	public String toString(){
	 return (name + "\t " + birthday.getDay() +"/" + birthday.getMonth() + "/" + birthday.getYear());
	 }
	};
