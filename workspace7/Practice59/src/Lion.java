public class Lion extends Animal {
	private int legs = 4;
	
	public void setLegs(int legs) { this.legs = legs; }
	public int getLegs() { return legs; }
	void roar() { System.out.println("roar()�� ȣ��Ǿ���"); }
	
	public String toString()
	{
		return "������: "+getWeight()+"kg - �׸� ����: "+picture+"- ���� :"+getLegs()+"��\n";
	}
}