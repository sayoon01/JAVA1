public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public void setX(int x) { this.x = x;}
	public void setY(int y) { this.y = y;}
	public void setZ(int z) { this.z = z;}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public int getZ() { return z; }
	
	public void fillBox() { empty = false; }
	public void emptyBox() { empty = true; }
	
	public String toString()
	{
		String rslt = "";
		
		rslt += ("가로 : " + getX() + "cm\n");
		rslt += ("세로 : " + getY() + "cm\n");
		rslt += ("높이 : " + getZ() + "cm\n");
		if(empty) {
			rslt += ("지금 박스는 비어 있습니다.");
		}else {
			rslt += ("지금 박스에는 물건이 들어 있습니다.");
		}
		
		return rslt;
	}
	
	public Box()
	{
		this(0, 0, 0);
	}
	public Box(int x, int y,int z)
	{
		setX(x);
		setY(y);
		setZ(z);
		emptyBox();
	}
}
