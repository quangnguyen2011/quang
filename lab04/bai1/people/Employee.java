// Bai 1
package people;
import java.util.*;

public class Employee extends Person{
	private double salary;
	public Employee(String ten, Date sn, double luong){
	 super(ten, sn);
	 salary = luong;
	 }
	public double getSalary(){
		return salary;
		}
	public String toString(){
		return (super.toString() + "\t" + salary);
		}
	}