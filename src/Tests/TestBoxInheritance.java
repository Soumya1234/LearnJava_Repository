package Tests;
import Chapter6.*;

//This class Tests the Inheheritance heirarchy formed by "Box","SubBox" classes defined in Chapter6 Package
public class TestBoxInheritance {

	public static void main(String[] args) {
		
		SubBox b=new SubBox(2,3,4,5);
		System.out.println(b.volume());
		System.out.println(b.weight());
		
		Box c=new Box();
		c=b;             //Assigning Subclass reference to a SuperClass reference
		//c.weight();    //Since superclass Box does not define the weight() function, 
		                 //c.weight(0) is illegal

	}

}
