public class Box {
	private int x;
	private int y;
	private int z;
	//private boolean empty;
	
	
	//public void fillBox() { empty = false; }
	//public void emptyBox() { empty = true; }
	
	public String toString() {
		return "����: " + x + ", ����: " + y + ", ����: " + z + "\n ����: "+ getVolume() + "\n ����: " + getWeight() + "";
	}
	public Box(int x, int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	//	emptyBox();
	}
	
	public int getVolume()
	{
		return x * y * z;
	}
	
	public double getWeight()
	{
		return getVolume() * 1.1;
	}
}

