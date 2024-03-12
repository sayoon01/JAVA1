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
		result += "재질: " + getAttribute() + "\n";
		result += "부피: " + getVolume() + "\n";
		result += "무게: " + getWeight();
		System.out.println(result);
	}
}
