import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date d1 = new Date();
		System.out.println("ù ��° ��¥�� �Է��ϼ���.");
		/*System.out.print("�⵵ : ");
		d1.setYear(sc.nextInt());
		System.out.print("�� : ");
		d1.setMonth(sc.nextInt());
		System.out.print("�� : ");
		d1.setDay(sc.nextInt());*/
		String s1 = d1.toString();
		System.out.println(s1);
		
		System.out.println("�� ��° ��¥�� �Է��ϼ���.");
		/*System.out.print("�⵵ : ");
		System.out.print("�� : ");
		System.out.print("�� : ");*/
		Date d2 = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		String s2 = d2.toString();
		System.out.println(s2);
		sc.close();
		
		int rslt = Date.compareDate(d1, d2);
		if(rslt == -1)
			System.out.println("ù ��° ��¥�� " + d1.toString() + "�� �ռ� ��¥�Դϴ�.");
		else if (rslt == 1)
			System.out.println("�� ��° ��¥�� " + d2.toString() + "�� �ռ� ��¥�Դϴ�.");
		else 
			System.out.println("�� ��¥�� ���� ��¥�Դϴ�.");
	}

}