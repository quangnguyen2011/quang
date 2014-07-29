//Bai 2
import animals.*;
import java.util.*;

public class AnimalsTest{

	public static void main( String [] args) {
		Animal cat = new Animal("cat");
		cat.sayHello();
		Cat meo =new Cat();
		Cow bo = new Cow();
		meo.sayHello();
		bo.sayHello();
		meo.selfIntroduce();
		bo.selfIntroduce();
	}
}