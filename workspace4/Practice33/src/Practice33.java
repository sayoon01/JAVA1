import java.util.Scanner;

public class Practice33 {

	public static void main(String[] args) {
		Rectangle rc = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		rc.width = sc.nextInt();
		System.out.print("���� �Է� : ");
		rc.height = sc.nextInt();
		sc.close();
		
		System.out.println("������ " + rc.width*rc.height + "�Դϴ�.");
		System.out.println("�ѷ��� " + (rc.width*2 + rc.height*2) + "�Դϴ�.");
	}

}