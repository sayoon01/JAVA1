import java.util.Scanner;

public class Practice58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		System.out.println("Shape ��ü ������ �Է��ϼ���. ");
		System.out.print("x��ǥ : ");
		s.x = sc.nextInt();
		System.out.print("y��ǥ : ");
		s.y = sc.nextInt();
		
		Circle c1 = new Circle(0);
		System.out.println("ù��° Circle ��ü ������ �Է��ϼ���. ");
		System.out.print("x��ǥ : ");
		c1.x = sc.nextInt();
		System.out.print("y��ǥ : ");
		c1.y = sc.nextInt();
		System.out.print("������ : ");
		c1.radius = sc.nextInt();
		
		Circle c2 = new Circle(0);
		System.out.println("�ι�° Circle ��ü ������ �Է��ϼ���. ");
		System.out.print("x��ǥ : ");
		c2.x = sc.nextInt();
		System.out.print("y��ǥ : ");
		c2.y = sc.nextInt();
		System.out.print("������ : ");
		c2.radius = sc.nextInt();
		
		sc.close();
		
		System.out.println("Shape ��ü �����Դϴ�.");
		s.print();
		
		
	}

}
