package Chapter6;
//Shows Passing of Objects as Parameters to Functions
public class Test {
	public static void main(String[] args)
	{
		TestDemo a=new TestDemo(1,2);
		TestDemo b= new TestDemo(1,3);
		TestDemo c=new TestDemo(1,2);
		System.out.println("a=b:"+ a.equals(b));
		System.out.println("a=c:"+ a.equals(c));
		System.out.println("c=b:"+ c.equals(b));
	}
}

class TestDemo
{
	int i;
    int j;
    
    TestDemo(int a,int b)
    {
   	 i=a;
   	 j=b;
    }
    
    TestDemo(TestDemo a)        //Passing an object as a parameter to a constructor.                          
    {                           // In this case , the object parameter is used to 
    	i=a.i;                  //initialize an object of the same class.
    	j=a.j;
    }
    
    boolean equals(TestDemo o)   //TestDemo object o is passed as parameter.
    {
   	 if(o.i==i && o.j==j)
   	 {
   		 return true;
   	 }
   	 return false;
    }
}
