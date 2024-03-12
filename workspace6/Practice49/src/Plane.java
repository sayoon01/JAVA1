public class Plane {
	private String model;
	private int id, capacity;
	
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
	}
	
	public String toString()
	{
		String rslt = "";
		rslt += ("�ĺ���ȣ : " + id + "��\n");
		rslt += ("�� : " + model + "\n");
		rslt += ("�°��� : " + capacity + "��\n");
		return rslt;
	}
}