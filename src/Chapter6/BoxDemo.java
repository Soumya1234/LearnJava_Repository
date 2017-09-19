package Chapter6;


class Box
{
	double width;
	double height;
	double depth;
	double volume()
	{
		return width*depth*height;
	}
	
	void setDimension(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box(double w,double h,double d)      // Box class Constructor with parameters
	{
		width=w;
		height=h;
		depth=d;
	}
}

public class BoxDemo {
	public static void main(String[] args)
	{
		Box mybox=new Box(10,20,15); //mybox is reference to an object of class Box
		Box mybox2=new Box(3,6,9);
		
		
		//double vol=mybox.depth * mybox.height  * mybox.width;
		//double vol2=mybox2.depth * mybox2.height * mybox2.width;
		
		System.out.println("Volume of Box1: "+ mybox.volume());
		System.out.println("Volume of Box2: "+ mybox2.volume());
		
		
	}

}
