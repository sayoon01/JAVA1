public class Eagle extends Animal{
	private int wings = 2;
	
	public void setWings(int wings) { this.wings = wings; }
	public int getWings() { return wings; }
	
	void fly() { System.out.println("fly()�� ȣ��Ǿ���"); }
	
	public String toString()
	{
		return ("������: "+getWeight()+"kg - �׸� ����: "+picture+"- ���� :"+ getWings()+"��\n");
	}
}