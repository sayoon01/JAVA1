
public class Rectangle extends Shape{
	private int width,height;
	
	public Rectangle() {
		super(); //������� ȣ��
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void printInfo()
	{
		System.out.println("�簢�� :: �߽���ǥ  " + getX() + "," + getY() + ") :: ���� - " + area() + " :: �ѷ� - " + perimeter());  
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
