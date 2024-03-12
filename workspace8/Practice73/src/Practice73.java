public class Practice73 {

	public static void main(String[] args) {
		Student stu0 = new Student(1111, 100, 3.2);
		String s0 = stu0.toString();
		System.out.println(s0);
		
		Undergraduate stu1 = new Undergraduate(2222, 100, 4.1, 3);
		System.out.println(stu1.toString());
		
		Graduate stu2 = new Graduate(3333, 100, 3.4, "SE");
		System.out.println(stu2.toString());
	}

}
