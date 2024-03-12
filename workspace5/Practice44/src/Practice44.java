import java.util.Scanner;
public class Practice44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Average obj = new Average();
		
		int n;
		
		System.out.print("���ϴ� ����� �����ϼ��� (1-����, 2-�Ǽ�)");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.print("��հ��� ���ϴ� ������ ������ �Է��ϼ��� : ");
			n = sc.nextInt();
			
			int a, b, c;
			System.out.print("1�� ������ �Է��ϼ��� : ");
			a = sc.nextInt();
			System.out.print("2�� ������ �Է��ϼ��� : ");
			b = sc.nextInt();
			
			if(n == 2)
			{
				int average = obj.getAverage(a, b);
				System.out.println("2���� ������ ����� " + average);
			}
			else if (n == 3)
			{
				System.out.print("3�� ������ �Է��ϼ��� : ");
				c = sc.nextInt();
				int average = obj.getAverage(a, b, c);
				System.out.println("3���� ������ ����� " + average);
			}
		}
		else if (choice == 2)
		{
			System.out.print("��հ��� ���ϴ� ������ ������ �Է��ϼ��� : ");
			n = sc.nextInt();
			
			double a, b, c;
			System.out.print("1�� �Ǽ��� �Է��ϼ��� : ");
			a = sc.nextDouble();
			System.out.print("2�� �Ǽ��� �Է��ϼ��� : ");
			b = sc.nextDouble();
			
			if(n == 2)
			{
				double average = obj.getAverage(a, b);
				System.out.println("2���� �Ǽ��� ����� " + average);
			}
			else if (n == 3)
			{
				System.out.print("3�� �Ǽ��� �Է��ϼ��� : ");
				c = sc.nextDouble();
				double average = obj.getAverage(a, b, c);
				System.out.println("3���� �Ǽ��� ����� " + average);
			}
		}
		sc.close();
	}

}