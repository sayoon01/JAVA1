public class Practice49 {

	public static void main(String[] args) {
		Plane p0 = new Plane();
		String s0 = p0.toString();
		
		Plane p1 = new Plane();
		p1.setId(1030615);
		p1.setModel("보잉 737");
		p1.setCapacity(1030615);
		String s1 = p1.toString();
		
		Plane p2 = new Plane(2464737,"보잉 747",150);
		String s2 = p2.toString();
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.print(s0);
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.print(s1);
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.print(s2);
	}

}
