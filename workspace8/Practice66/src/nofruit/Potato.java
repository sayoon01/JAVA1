package nofruit;

import fruit.Food;

public class Potato extends Food{
	
	
	public int getUnitPrice() {
		return price /(int) weight;
	}
	
	
	public String toString() {
		String rslt="";
		rslt += "칼로리 : " + getCalory() + "\n";
		rslt += "가격 : " + price + "\n";
		rslt += "무게 : " + weight + "\n";
		rslt += "단위가격 : " + getUnitPrice() + "\n";
		return rslt;
	}
}
