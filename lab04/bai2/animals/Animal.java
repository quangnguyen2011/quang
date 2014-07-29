// Bai 2
package animals;
import java.util.*;

public class Animal{
	private String name;
	public Animal(){
	name = "no name";
	}
	public Animal(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void selfIntroduce(){
		System.out.println(" My name is ..." + name);
	}
	public void sayHello(){
		System.out.println("Well... I don't know what to say");
	}
}