package Chapter3;

public class TypePromotion {
	public static void main(String[] args)
	{
		byte c=50;
		//byte b=c*2; // Illegal as the operand c in the * operation has been promoted to int 
		// thus generating  an integer result which is needed to be cast to byte to make the operation legal
		System.out.println(c);
	}

}
