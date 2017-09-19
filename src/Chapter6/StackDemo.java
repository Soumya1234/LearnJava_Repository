package Chapter6;

//A Class representing the Stack Data Structure
class Stack
{
	int size;
	int top;
	double[] stck;
	
	//Constructor initializing the Size of the Stack
	Stack(int size)
	{
		this.size=size;
		top=-1;
		stck=new double[size];
	}
	
	//Function to Push one item to the top of the stack
	boolean push(double a)    
	{
		if(top==size-1)
		{
			return false;
		}
		else
		{
			stck[++top]=a;
			return true;
		}
	}
	
	//Function to pop one item from the top of the stack
	double pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty!!");
			return 0;
		}
		return stck[top--];	
	}
	
}

public class StackDemo {
     public static void main(String[] args)
     {
    	 Stack s = new Stack(3);
    	 s.push(1);
    	 s.push(2);
    	 s.push(3);
    	 
    	 while(s.top!=-1)
    	 {
    		 System.out.println("s.pop():"+s.pop());
    	 }
    	 
     }
}
