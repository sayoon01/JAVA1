import java.util.Scanner;

public class Practice36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie obj1, obj2;
		obj1 = new Movie();
		obj2 = new Movie();
		
		System.out.println("��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ ������ ?");
		obj1.title = sc.next();
		System.out.print("������ ?");
		obj1.score = sc.nextInt();
		System.out.print("������ ?");
		obj1.director = sc.next();
		System.out.print("���� �⵵�� ?");
		obj1.year = sc.nextInt();
		
		System.out.println("\n��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ ������ ?");
		obj2.title = sc.next();
		System.out.print("������ ?");
		obj2.score = sc.nextInt();
		System.out.print("������ ?");
		obj2.director = sc.next();
		System.out.print("���� �⵵�� ?");
		obj2.year = sc.nextInt();
		
		sc.close();
		System.out.print("��ȭ " + obj1.title + "�� ��ȭ " + obj2.title + "���� ������ ");
		if(obj1.score > obj2.score)
		{
			System.out.println("�� �����ϴ�.");
		}
		else if(obj1.score < obj2.score)
		{
			System.out.println("�����ϴ�.");
		}
		else
		{
			System.out.println("�� �����ϴ�.");
		}
		
		System.out.print("��ȭ " + obj1.title + "�� ��ȭ " + obj2.title + "����  ");
		if(obj1.year < obj2.year)
		{
			System.out.println("���� �����Ǿ����ϴ�.");
		}
		else if(obj1.score > obj2.score)
		{
			System.out.println("���߿� �����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("���� �⵵�� �����Ǿ����ϴ�.");
		}
	}
}