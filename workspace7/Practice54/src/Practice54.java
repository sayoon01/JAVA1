import java.util.Scanner;
public class Practice54 {

	public static void main(String[] args) {
		Plane p0 = new Plane();
		String s0 = p0.toString();
		System.out.println("����Ʈ ������� �����Դϴ�.");
		System.out.print(s0);
		int n0 = Plane.getPlanes();
		System.out.println("������� �߰��� ������ ��� " + n0 + "���Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		Plane p1 = new Plane();
		p1.setId(sc.nextInt());
		p1.setModel(sc.next());
		p1.setCapacity(sc.nextInt());
		String s1 = p1.toString();
		System.out.println("������ ������� �����Դϴ�.");
		System.out.print(s1);
		int n1 = Plane.getPlanes();
		System.out.println("������� �߰��� ������ ��� " + n1 + "���Դϴ�.");
		sc.close();
		
		Plane p2 = new Plane(2464737,"���� 747",150);
		String s2 = p2.toString();
		System.out.println("������ ������� �����Դϴ�.");
		System.out.print(s2);
		int n2 = Plane.getPlanes();
		System.out.println("������� �߰��� ������ ��� " + n2 + "���Դϴ�.");
	}

}