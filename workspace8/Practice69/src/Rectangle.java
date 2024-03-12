
public class Rectangle extends Shape{
	private int width,height;
	
	public Rectangle() {
		super(); //명시적인 호출
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void printInfo()
	{
		System.out.println("사각형 :: 중심좌표  " + getX() + "," + getY() + ") :: 면적 - " + area() + " :: 둘레 - " + perimeter());  
	}
	
	public int area() 
	{
		return width*height;
	}
	
	public int perimeter()
	{
		return (width*2 + height*2);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
