public class Practice49 {

	public static void main(String[] args) {
		Plane p0 = new Plane();
		String s0 = p0.toString();
		
		Plane p1 = new Plane();
		p1.setId(1030615);
		p1.setModel("���� 737");
		p1.setCapacity(1030615);
		String s1 = p1.toString();
		
		Plane p2 = new Plane(2464737,"���� 747",150);
		String s2 = p2.toString();
		
		System.out.println("����Ʈ ������� �����Դϴ�.");
		System.out.print(s0);
		System.out.println("������ ������� �����Դϴ�.");
		System.out.print(s1);
		System.out.println("������ ������� �����Դϴ�.");
		System.out.print(s2);
	}

}