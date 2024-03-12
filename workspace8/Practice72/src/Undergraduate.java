
public class Undergraduate extends Student{
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return "학번 : " + getId() + ", 등록금 : " + getTuition() + ", 평균등급 : " + getGpa() + " 학년 : " + year + "";
	}
	
	public Undergraduate() {
		//super(); 사용자가 적어줘도 무방, 묵시적 생성자 호출, 부모 class에 있는 매개변수 없는 생성자 호출
		year = 0;
	}
	
	public Undergraduate(int id, int tuition, double gpa, int year) {
		super(id, tuition, gpa);
		this.year = year;
	}
}
