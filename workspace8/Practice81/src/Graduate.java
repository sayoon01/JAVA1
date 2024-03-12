
public class Graduate extends Student{
	private String lab;

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}
	
	public Graduate() {
		super(); // 명시적인 생성자 호출도 가능
		lab = "null";
	}
	
	public Graduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	
	public String toString() {
		return "학번 : " + getId() + ", 등록금 : " + getTuition() + ", 평균등급 : " + getGpa() + ", 장학금 : " + calcScholarship() +  ", 연구실 : " + lab + "";
	}
	
	public int calcScholarship() {
		if(getGpa() >= 3.5)
			return (int)(getTuition()*0.3+20);
		else
			return (int)(getTuition()*0.3);
	}
}
