import java.util.Scanner;

public class Practice42 {

	public static void main(String[] args) {
		Date birthday = new Date();
		Date adultday = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ��� : ");
		birthday.setYear(sc.nextInt());
		adultday.setYear(birthday.year + 20);
		System.out.print("�¾ ���� �Է��ϼ��� : ");
		birthday.setMonth(sc.nextInt());
		adultday.setMonth(birthday.month);
		System.out.print("�¾ ��¥�� �Է��ϼ��� : ");
		birthday.setDay(sc.nextInt());
		adultday.setDay(birthday.day);
		
		sc.close();
		
		System.out.println("����� ������ " + birthday.toString());
		System.out.println("����� �������� " + adultday.toString());
		System.out.println("����� ������ " + birthday.toString());
	}

}
