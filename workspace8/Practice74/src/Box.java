public class Box {
	private int x;
	private int y;
	private int z;
	//private boolean empty;
	
	
	//public void fillBox() { empty = false; }
	//public void emptyBox() { empty = true; }
	
	public String toString() {
		return "가로: " + x + ", 세로: " + y + ", 높이: " + z + "\n 부피: "+ getVolume() + "\n 무게: " + getWeight() + "";
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

