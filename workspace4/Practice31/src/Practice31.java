import java.util.Scanner;

public class Practice31 {

	public static void main(String[] args) {
		Date obj;
		obj = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է��ϼ��� : ");
		obj.year = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ��� : ");
		obj.month = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ��� : ");
		obj.day = sc.nextInt();
		sc.close();
		
		System.out.println("����� ������ " + obj.year + "�� " + obj.month + "�� " + obj.day + "���Դϴ�.");
	}

}
