public class Lion extends Animal {
	private int legs = 4;
	
	public void setLegs(int legs) { this.legs = legs; }
	public int getLegs() { return legs; }
	void roar() { System.out.println("roar()가 호출되었음"); }
	
	public String toString()
	{
		return "몸무게: "+getWeight()+"kg - 그림 설명: "+picture+"- 날개 :"+getLegs()+"개\n";
	}
}
