
public class Graduate extends Student{
	private String lab;

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}
	
	public Graduate() {
		super(); // �������� ������ ȣ�⵵ ����
		lab = "null";
	}
	
	public Graduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	
	public String toString() {
		return "�й� : " + getId() + ", ��ϱ� : " + getTuition() + ", ��յ�� : " + getGpa() + ", ���б� : " + calcScholarship() +  ", ������ : " + lab + "";
	}
	
	public int calcScholarship() {
		if(getGpa() >= 3.5)
			return super.calcScholarship()+20;
		else
			return super.calcScholarship();
	}
}