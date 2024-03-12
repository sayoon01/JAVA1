
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

	public boolean isSmallerThan(Rectangle s) {
		if(area() < s.area())
			return true;
		else
			return false;
	}
}
