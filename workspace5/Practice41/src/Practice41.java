import java.util.Scanner;

public class Practice41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.print("���� �Է� : ");
		rec.width = sc.nextInt();
		System.out.print("���� �Է� : ");
		rec.height = sc.nextInt();
		
		sc.close();
		
		System.out.println("������ " + rec.area() + "�Դϴ�.");
		System.out.println("�ѷ��� " + rec.perimeter() + "�Դϴ�.");
	}

}
