package fruit;

public class Melon extends Food {
	String farmInfo;
	
	public String toString() {
		String rslt="";
		rslt += "Į�θ� : " + calory + "\n";
		rslt += "���� : " + price + "\n";
		rslt += "���� : " + weight + "\n";
		rslt += "������ : " + farmInfo + "\n";
		return rslt;
	}

	public void setFarmInfo(String farmInfo) {
		this.farmInfo = farmInfo;
	}
	
	
}
