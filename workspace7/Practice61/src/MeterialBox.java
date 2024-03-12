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
	
	
}
