package nofruit;

import fruit.Food;

public class Potato extends Food{
	
	
	public int getUnitPrice() {
		return price /(int) weight;
	}
	
	
	public String toString() {
		String rslt="";
		rslt += "Į�θ� : " + getCalory() + "\n";
		rslt += "���� : " + price + "\n";
		rslt += "���� : " + weight + "\n";
		rslt += "�������� : " + getUnitPrice() + "\n";
		return rslt;
	}
}