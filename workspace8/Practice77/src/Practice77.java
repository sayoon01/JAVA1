
public class Practice77 {

	public static void main(String[] args) {
		Student stu0 = new Student(20111234, 100, 3.2);
		stu0.setName("ȫ�浿");
		stu0.setMajor("��ǻ����");
		String s0 = stu0.toString();
		System.out.println(s0);
		
		Student stu1 = new Student(20121357, 100, 4.1);
		stu1.setName("������");
		stu1.setMajor("������");
		System.out.println(stu1.toString());
	
		Student stu2 = new Student(20121357, 100, 3.4);
		stu2.setName("������");
		stu2.setMajor("������");
		System.out.println(stu2.toString());
		
		Student stu3 = new Student();
		stu3 = stu0;
		
		Student.printInfo(stu0, stu1);
		Student.printInfo(stu1, stu1);
		Student.printInfo(stu1, stu2);
		Student.printInfo(stu0, stu3);
	}
}
