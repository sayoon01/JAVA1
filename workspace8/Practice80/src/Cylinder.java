
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder()
	{
		this(0,0,0,0);
	}
	public Cylinder(double radius)
	{
		this(0,0,radius,0);
	}
	public Cylinder(double radius, double height)
	{
		this(0,0,radius,height);
	}
	public Cylinder(int x, int y, double radius, double height)
	{
		super(x,y,radius);
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	public double getVolume()
	{
		return getArea()*getHeight();
	}
	@Override
	public String toString() {
		String rslt = super.toString();
		rslt += ("\n높이 : " + getHeight());
		rslt += ("\n부피 : " + getVolume());
		return rslt;
	}
	
}
