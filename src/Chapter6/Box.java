package Chapter6;

public class Box {
	
   private double width;
   private double height;
   private double depth;
   
   public Box()
   {
	   width=-1;
	   height=-1;
	   depth=-1;
   }
   
   public Box(double height,double depth, double width)
   {
	   this.height=height;
	   this.depth=depth;
	   this.width=width;
   }
   
   public Box(double x)
   {
	   height=depth=width=x;
   }
   
   public Box(Box o)
   {
	   height=o.height;
	   depth=o.depth;
	   width=o.width;
   }
   
   public double volume()
   {
	   return height*depth*width;
   }
   
}
