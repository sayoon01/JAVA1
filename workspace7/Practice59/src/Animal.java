public class Animal {
	private double weight;
	String picture;
	
	public void setWeight(double weight) { this.weight = weight; }
	double getWeight() { return weight;}
	private String printMsg() { return ("eat()가 호출되었음"); }
	void eat() {
		String msg = printMsg();
		System.out.println(msg);
	}
	void sleep() { System.out.print("sleep()가 호출되었음"); }
	
	public String toString() 
	{	return "몸무게: "+getWeight()+"kg - 그림 설명: "+picture+"\n";
	}
}
