public class Animal {
	private double weight;
	String picture;
	
	public void setWeight(double weight) { this.weight = weight; }
	double getWeight() { return weight;}
	private String printMsg() { return ("eat()�� ȣ��Ǿ���"); }
	void eat() {
		String msg = printMsg();
		System.out.println(msg);
	}
	void sleep() { System.out.print("sleep()�� ȣ��Ǿ���"); }
	
	public String toString() 
	{	return "������: "+getWeight()+"kg - �׸� ����: "+picture+"\n";
	}
}