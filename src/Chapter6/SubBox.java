package Chapter6;

public class SubBox extends Box
{
     private double weight;
     
     public SubBox(double depth,double width,double height,double weight)
     {
    	 super(depth,width,height);
    	 this.weight=weight;
     }
     
     public SubBox()
     {
    	 super();
    	 this.weight=-1;
     }
     
     public SubBox(double x,double y)
     {
    	 super(x);
    	 this.weight=y;
     }
     
     public SubBox(SubBox ob)
     {
    	 super(ob);
    	 this.weight=ob.weight;
    	 
     }
     
     public double weight()
     {
    	 return this.weight;
     }
     
}
