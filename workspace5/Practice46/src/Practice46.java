import java.util.Scanner;

public class Practice46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie obj = new Movie();
		
		System.out.println("��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ ������ ?");
		obj.setTitle(sc.next());
		System.out.print("������ ?");
		obj.setScore(sc.nextInt());
		System.out.print("������ ?");
		obj.setDirector(sc.next());
		System.out.print("���� �⵵�� ?");
		obj.setYear(sc.nextInt());
		
		sc.close();
		
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");
		String s = obj.toString();
		System.out.print(s);
	}

}
