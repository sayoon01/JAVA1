import java.util.Scanner;

public class Practice34 {

	public static void main(String[] args) {
		Rectangle rc1, rc2;
		rc1 = new Rectangle();
		rc2 = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° �簢���� ������ �Է��ϼ���.");
		System.out.print("���� �Է� : ");
		rc1.width = sc.nextInt();
		System.out.print("���� �Է� : ");
		rc1.height = sc.nextInt();
		System.out.println("�� ��° �簢���� ������ �Է��ϼ���.");
		System.out.print("���� �Է� : ");
		rc2.width = sc.nextInt();
		System.out.print("���� �Է� : ");
		rc2.height = sc.nextInt();
		sc.close();
		
		System.out.println("ù ��° �簢���� ������ " + rc1.width*rc1.height + "�Դϴ�.");
		System.out.println("ù ��° �簢���� �ѷ��� " + (rc1.width*2 + rc1.height*2) + "�Դϴ�.");
		System.out.println("�� ��° �簢���� ������ " + rc2.width*rc2.height + "�Դϴ�.");
		System.out.println("�� ��° �簢���� �ѷ��� " + (rc2.width*2 + rc2.height*2) + "�Դϴ�.");
	}
}
