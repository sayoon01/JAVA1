public class MaterialBox extends Box{
	private String attribute;
	
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}


	public MaterialBox(int x,int y,int z,String attribute)
	{
		super(x, y, z);
		this.attribute = attribute;
	}
	
	public double getWeight() {
		if(attribute.equals("paper")==true)
			return super.getVolume()*1.5;
		else if(attribute.equals("wood")==true)
			return super.getVolume()*2.5;
	}
}
