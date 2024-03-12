
public class Circle extends Shape{
	private double radius;
	
	public Circle()
	{
		this(0,0,0);
	}
	
	public Circle(double radius)
	{
		this(0,0,radius);
	}
	
	public Circle(int x, int y, double radius)
	{
		super(x,y);
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		String rslt = super.toString();
		rslt += ("\n반지름 : " + getRadius());
		rslt += ("\n단면적 : " + getArea());
		return rslt;
	}
	
}
