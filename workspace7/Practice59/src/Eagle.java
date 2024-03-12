public class Eagle extends Animal{
	private int wings = 2;
	
	public void setWings(int wings) { this.wings = wings; }
	public int getWings() { return wings; }
	
	void fly() { System.out.println("fly()가 호출되었음"); }
	
	public String toString()
	{
		return ("몸무게: "+getWeight()+"kg - 그림 설명: "+picture+"- 날개 :"+ getWings()+"개\n");
	}
}
