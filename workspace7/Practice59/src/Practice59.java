import java.util.Scanner;
public class Practice59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal a = new Animal();
		System.out.println("Animal ��ü animal�� �����մϴ�.");
		System.out.println("������ �߰��� ������ �Է��ϼ��� : ");
		a.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		a.setWeight(sc.nextDouble());
		a.eat();
		
		Lion buba = new Lion();
		System.out.println("Lion ��ü buba�� �����մϴ�.");
		System.out.println("������ �߰��� ������ �Է��ϼ��� : ");
		buba.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		buba.setWeight(sc.nextDouble());
		buba.eat();
		System.out.print(" : ");
		buba.roar();
		
		Eagle paco = new Eagle();
		System.out.println("Eagle ��ü pack�� �����մϴ�.");
		System.out.println("������ �߰��� ������ �Է��ϼ��� : ");
		paco.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		paco.setWeight(sc.nextDouble());
		paco.sleep();
		System.out.print(" : ");
		paco.fly();
		
		sc.close();
		
		System.out.println("Animal ��ü animal�� �����Դϴ�.");
		String s1 = a.toString();
		System.out.print(s1);
		System.out.println("Lion ��ü buba�� �����Դϴ�.");
		String s2 = buba.toString();
		System.out.print(s2);
		System.out.println("Eagle ��ü paco�� �����Դϴ�.");
		String s3 = paco.toString();
		System.out.print(s3);
	}

}
