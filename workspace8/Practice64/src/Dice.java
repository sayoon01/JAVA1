import java.util.Random;

public class Dice {
	private int value;
	private Random rg = new Random();
	
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
	


	/*public Random getRg() {
		return rg;
	}


	public void setRg(Random rg) {
		this.rg = rg;
	}*/


	public Dice() {
		setValue(0);
		//this.rg = 0;
	}


	public void roll() {
		setValue(rg.nextInt(6)+1);
	}
	
	

	public String toString() {
		String result = "";
		result += "¡÷ªÁ¿ß = " + getValue();
		return result;
	}

	
}
