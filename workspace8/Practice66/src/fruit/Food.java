package fruit;

public class Food {
	int calory;
	protected int price;
	protected double weight;
	
	public String toString() { 
		String rslt="";
		rslt += "Į�θ� : " + calory + "\n";
		rslt += "���� : " + price + "\n";
		rslt += "���� : " + weight + "\n";
		return rslt;
	}
	
	public Food() {
		calory = 0;
		price = 0;
		weight = 0;
	}
	
	public void setCalory(int calory) {
		this.calory = calory;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	protected int getCalory() {
		return calory;
	}
}
