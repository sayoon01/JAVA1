public class Practice50 {

	public static void main(String[] args) {
		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box(100, 60, 20);
		
		b1.setX(30);
		b1.setY(45);
		b1.setZ(53);
		b1.fillBox();	
		
		String s0 = b0.toString();
		System.out.println("����Ʈ ������ �����Դϴ�.");
		System.out.println(s0);
		String s1 = b1.toString();
		System.out.println("ù ��° ������ �����Դϴ�.");
		System.out.println(s1);
		String s2 = b2.toString();
		System.out.println("�� ��° ������ �����Դϴ�.");
		System.out.println(s2);
	}

}