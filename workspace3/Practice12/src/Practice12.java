import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ���� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		/* int minNum = -10000;
		if (num1<num2) {
			minNum = num1;	
		}
		else
		{
			minNum = num2;
		}
		
		if(num3<minNum)
		{
			minNum = num3;
		} */
		/*int minNum;
	
		minNum = num1;
		if(num2 < minNum)
		{
			minNum = num2;
			if(num3 < minNum)
			{
				minNum = num3;
			}
		}
		else if (num3 < minNum)
		{
			minNum = num3;
		}*/
		int minNum;
		minNum = num1;
		if(num2 < minNum)
		{
			minNum = num2;
		}
		if(num3 < minNum)
		{
			minNum = num3;
		}
		
		System.out.println("���� ���� ���ڴ� " + minNum + "�Դϴ�.");
		
		sc.close();
	}

}
