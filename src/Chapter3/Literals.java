package Chapter3;

public class Literals {
    //Demonstrates the characteristics of Literals. The assignment is legal if 
	//the range of the target type is greater than the source type
	
	//Long=64 bits; Short=16 bits, Integer=32 bits, Char=16 bits, Byte=8 bits, Float=32 bits; Double=64 bits 
	public static void main(String[] args) {
		int x=999999;
		long c=x; //Legal as the range of Long is greater than that of Integer
		//short d=x; //Illegal as the range of Short is lower than the Integer
		short e=89;
		//char ch=e; // Illegal as the short and Char both are 16 bit literals
		int y=39;
		//ch=y; //Illegal as the char range is less than integer range
		//ch=89; //Legal as the integer '89' is within the range of the character
		char ch2=756;
		System.out.println(ch2);
		

	}

}
