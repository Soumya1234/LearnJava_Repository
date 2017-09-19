package Chapter3;

public class BoolTest {

	public static void main(String[] args)
	{
		boolean b;
		b=true;
		System.out.println("b is :"+b);
		if(b) System.out.println("This gets executed.");
		b=false;
		if(b) System.out.println("This gets skipped.");
		System.out.println("(10>9) is:"+(10>9));
		
	}
}
