import java.util.Scanner;

public class Practice52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie m0 = new Movie();
		String s0 = m0.toString();
		System.out.println("����Ʈ ��ȭ�� �����Դϴ�.");
		System.out.print(s0);
		
		Movie m1 = new Movie();
		System.out.println("��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		m1.setTitle(sc.next());
		System.out.print("������? ");
		m1.setDirector(sc.next());
		System.out.print("���۳⵵��? ");
		m1.setYear(sc.nextInt());
		System.out.print("������? ");
		m1.setScore(sc.nextInt());
		sc.close();
		
		String s1 = m1.toString();
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");
		System.out.print(s1);
	}

}
