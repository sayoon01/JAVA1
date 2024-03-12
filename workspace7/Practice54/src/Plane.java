public class Plane {
	private String model;
	private int id, capacity;
	private static int planes = 0;
	
	void setModel (String model) { this.model = model;}
	void setId (int id) { this.id = id;}
	void setCapacity(int capacity) { this.capacity = capacity;}
	
	public Plane()
	{
		this(0, "��", 0);
	}
	
	public Plane(int id, String model, int capacity) 
	{
		this.id = id;
		this.model = model;
		this.capacity = capacity;
		planes++;
	}
	static int getPlanes() { return planes; }
	public String toString()
	{
		String rslt = "";
		rslt += ("�ĺ���ȣ : " + id + "��\n");
		rslt += ("�� : " + model + "\n");
		rslt += ("�°��� : " + capacity + "��\n");
		return rslt;
	}
}
