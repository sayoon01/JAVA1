public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	
	public void fillBox() { empty = false; }
	public void emptyBox() { empty = true; }
	
	public String toString()
	{
		String rslt = "";
		
		rslt += ("가로 : " + x + "cm\n");
		rslt += ("세로 : " + y + "cm\n");
		rslt += ("높이 : " + z + "cm\n");
		if(empty) {
			rslt += ("지금 박스는 비어 있습니다.");
		}else {
			rslt += ("지금 박스에는 물건이 들어 있습니다.");
		}
		
		return rslt;
	}
	
	
	public Box(int x, int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		emptyBox();
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
