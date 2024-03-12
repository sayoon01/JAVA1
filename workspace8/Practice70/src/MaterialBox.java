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
		setAttribute(attribute);
	}
	
	public void printInfo() {
		String result = "";
		result += "����: " + getAttribute() + "\n";
		result += "����: " + getVolume() + "\n";
		result += "����: " + getWeight();
		System.out.println(result);
	}
}