import java.util.Scanner;

public class Practice69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape obj1 = new Shape();
		System.out.println("���� ������ �Է��ϼ���");
		System.out.print("�߽���ǥ�� X�� : ");
		obj1.setX(sc.nextInt());
		System.out.print("�߽���ǥ�� Y�� : ");
		obj1.setY(sc.nextInt());
		
		Rectangle obj2 = new Rectangle();
		System.out.println("�簢�� ������ �Է��ϼ���");
		System.out.print("�߽���ǥ�� X�� : ");
		obj2.setX(sc.nextInt());
		System.out.print("�߽���ǥ�� Y�� : ");
		obj2.setY(sc.nextInt());
		System.out.print("���α��� : ");
		obj2.setWidth(sc.nextInt());
		System.out.print("���α��� : ");
		obj2.setHeight(sc.nextInt());
		
		System.out.println("������� ������ ������ ������ �����ϴ�.");
		System.out.println(obj1.toString());
		obj2.printInfo();
	}

}