// Bai 1
import people.*;

public class Manager extends Employee{
	private Employee assitant;
	
	public Manager(String ten, Date sn, double luong){
		super(ten, sn, luong);
		}
	public void setAssistant(Employee Ass){
		assitant = Ass;
		}
	public String toString(){
		return (super.toString() + assitant);
		}
}	