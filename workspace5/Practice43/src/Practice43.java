import java.util.Scanner;

public class Practice43 {

	public static void main(String[] args) {
		Date birthday = new Date();
		Date adultday = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ��� : ");
		birthday.setYear(sc.nextInt());
		int tmpYear = birthday.getYear() + 20;
		adultday.setYear(tmpYear);
		System.out.print("�¾ ���� �Է��ϼ��� : ");
		birthday.setMonth(sc.nextInt());
		adultday.setMonth(birthday.getMonth());
		System.out.print("�¾ ��¥�� �Է��ϼ��� : ");
		birthday.setDay(sc.nextInt());
		adultday.setDay(birthday.getDay());
		
		sc.close();
		
		String s1 = birthday.toString();
		System.out.println("����� ������ " + s1);
		String s2 = birthday.toString();
		System.out.println("����� �������� " + s2);
		System.out.println("����� ������ " + s1);

	}

}