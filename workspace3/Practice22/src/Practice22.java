import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int absValue = abs(num);
		System.out.println("�Էµ� ���� " + num + "�� ���밪�� " + absValue +"�Դϴ�.");
		sc.close();
	}
	
	public static int abs (int n)
	{
		if(n<0)
			return -n;
		else
			return n;
	}
}