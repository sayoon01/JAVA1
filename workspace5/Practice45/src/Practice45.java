import java.util.Scanner;

public class Practice45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		System.out.print("�簢���� ���� : ");
		rec.setWidth(sc.nextInt());
		System.out.print("�簢���� ���� : ");
		rec.setHeight(sc.nextInt());
		
		sc.close();
		
		System.out.println("�簢���� ���δ� " + rec.getWidth() + ", ���δ� " + rec.getHeight() + "�Դϴ�.");
		System.out.println("�簢���� ���̴� " + rec.area() + "�̰�, " + "�ѷ��� " + rec.perimeter() + "�Դϴ�.");
	}
}
