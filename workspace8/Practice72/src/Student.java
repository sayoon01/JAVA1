
public class Student {
	private int id, tuition;
	private double gpa;
	public int getId() {
		return id;
	}
	public int getTuition() {
		return tuition;
	}
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public Student() {
		this(0,0,0.0);
	}
	
	public Student(int id, int tuition, double gpa) {
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}

	public String toString() {
		return "학번 : " + id + ", 등록금 : " + tuition + ", 평균등급 : " + gpa + "";
	}
	
	
}
