package Chapter3;

public class CastDemo {
	public static void main(String[] args)
	{
		int x=258;
		byte b= (byte)x; // Casting an integer to byte. If the range 256 of byte is exceeded it
		//assigns (x%256) to the target variable
		System.out.println(b); 
		
		
		
	}
}
