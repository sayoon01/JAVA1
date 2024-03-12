public class MeterialBox extends Box{
	private String attribute;
	
	
	public String getAttribute() {
		return attribute;
	}


	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}


	public MeterialBox(int width,int length,int height,String attribute)
	{
		setX(width);
		setY(length);
		setZ(height);
		setAttribute(attribute);
	}
	
	public void printInfo()
	{
		System.out.println("가로 : " + getX() + ", " + "세로 : " + getY() + "높이 : " + getZ());
		System.out.println("재질 : " + getAttribute());
		System.out.println("부피 : " + getVolume());
		System.out.println("무게 : " + getWeight());
	}
}
