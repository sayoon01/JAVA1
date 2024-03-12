
public class Rectangle {
	private int width;
	private int height;
	
	int area()
	{
		return width * height;
	}
	
	int perimeter()
	{
		return (width * 2 + height * 2);
	}
	
	public void setWidth(int w) { width = w; }
	public void setHeight(int h) { height = h; }
	
	public int getWidth() {return width;}
	public int getHeight() {return height;}
}
