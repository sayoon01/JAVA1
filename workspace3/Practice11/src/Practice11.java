import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight = sc.nextDouble();
		
		double stdWeight = (height - 100) * 0.9;
		System.out.println("ǥ��ü���� " + stdWeight + "�Դϴ�.");
		
		if(weight < stdWeight)
		{
			System.out.println("��ü���Դϴ�.");
		}
		else if (weight == stdWeight)
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("��ü���Դϴ�.");
		}
		
		sc.close();
	}

}
