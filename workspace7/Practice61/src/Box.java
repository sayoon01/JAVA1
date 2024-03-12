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
		
		rslt += ("���� : " + getX() + "cm\n");
		rslt += ("���� : " + getY() + "cm\n");
		rslt += ("���� : " + getZ() + "cm\n");
		if(empty) {
			rslt += ("���� �ڽ��� ��� �ֽ��ϴ�.");
		}else {
			rslt += ("���� �ڽ����� ������ ��� �ֽ��ϴ�.");
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