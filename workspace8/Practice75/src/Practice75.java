import java.util.Scanner;

public class Practice75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bodydata my = new Bodydata();
		System.out.print("�� Ű�� �Է��ϼ��� : ");
		my.setHeight(sc.nextInt());
		System.out.print("�� �����Ը� �Է��ϼ��� : ");
		my.setWeight(sc.nextInt());
		
		Bodydata your = new Bodydata();
		System.out.print("����� Ű�� �Է��ϼ��� : ");
		your.setHeight(sc.nextInt());
		System.out.print("����� �����Ը� �Է��ϼ��� : ");
		your.setWeight(sc.nextInt());
		
		boolean flag = my.isTallerThan(your);
		if(flag == true)
			System.out.println("Ű�� ���� �� Ů�ϴ�.");
		else 
			System.out.println("Ű�� ����� �� Ů�ϴ�.");
		
		if(my.needDiet() == true)
			System.out.println("���� ���̾�Ʈ�� �ʿ��մϴ�.");
		else
			System.out.println("���� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		
		if(your.needDiet() == true)
			System.out.println("����� ���̾�Ʈ�� �ʿ��մϴ�.");
		else
			System.out.println("����� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		
		sc.close();	
	}

}
