
public class Student {
	private int id, tuition;
	private double gpa;
	private String name;
	private String major;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
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
		return "학번 : " + id + ", 등록금 : " + tuition + ", 평균등급 : " + gpa + ", 장학금 : " + calcScholarship() + ", 이름 : " + name + ", 전공 : " + major + "";
	}
	
	public int calcScholarship() {
		return (int)(tuition * 0.3);
	}
	
	public boolean isTheSame(Student s) {
		if(id == s.id)
			return true;
		else
			return false;
	}
	public static void printInfo(Student sa, Student sb) {
		if(sa == sb)
			System.out.println("같은 객체");
		else
		{
			System.out.print("다른 객체");
			if(sa.id == sb.id)
				System.out.println("/같은 학번");
			else
				System.out.println("/다른 학번");
		}
	}
}
