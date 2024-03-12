
public class Circle {
	private double radius;
	
	public Circle() {
		this(0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return getRadius()*getRadius()*3.14; 
	}
}