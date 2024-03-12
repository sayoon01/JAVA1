
public class Bodydata {
	private int weight;
	private int height;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int idealWeight() {
		return height-110;
	}
	public boolean isTallerThan(Bodydata b) {
		if(this.height > b.height)
			return true;
		else
			return false;
	}
	public boolean needDiet() {
		if(this.weight > idealWeight())
			return true;
		else
			return false;
	}
}