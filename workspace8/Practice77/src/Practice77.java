
public class Practice77 {

	public static void main(String[] args) {
		Student stu0 = new Student(20111234, 100, 3.2);
		stu0.setName("홍길동");
		stu0.setMajor("컴퓨터학");
		String s0 = stu0.toString();
		System.out.println(s0);
		
		Student stu1 = new Student(20121357, 100, 4.1);
		stu1.setName("성춘향");
		stu1.setMajor("국문학");
		System.out.println(stu1.toString());
	
		Student stu2 = new Student(20121357, 100, 3.4);
		stu2.setName("성춘향");
		stu2.setMajor("국문학");
		System.out.println(stu2.toString());
		
		Student stu3 = new Student();
		stu3 = stu0;
		
		Student.printInfo(stu0, stu1);
		Student.printInfo(stu1, stu1);
		Student.printInfo(stu1, stu2);
		Student.printInfo(stu0, stu3);
	}
}
