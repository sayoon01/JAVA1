import java.util.Scanner;

public class Practice40 {

	public static void main(String[] args) {
		String s;
		Date birthday = new Date();
		Date adultday = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ��� : ");
		birthday.year = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ��� : ");
		adultday.month = birthday.month = sc.nextInt();
		System.out.print("�¾ ��¥�� �Է��ϼ��� : ");
		adultday.day = birthday.day = sc.nextInt();
		
		sc.close();
		
		adultday.year = birthday.year + 20;
		
		s = birthday.toString();
		System.out.println("����� ������ " + s);
		s = adultday.toString();
		System.out.println("����� �������� " + s);
		System.out.println("����� ������ " + birthday.toString());
	}

}
