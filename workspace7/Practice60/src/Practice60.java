public class Practice60 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("김동덕");
		s1.setYear(4);
		Student s2 = new Student();
		s2.setName("홍길동");
		s2.setYear(1);
		
		System.out.println(s1.getName()+"학생은 " +s1.getYear() +"학년입니다.");
		System.out.println(s2.getName()+"학생은 " +s2.getYear() +"학년입니다.");
	}

}
