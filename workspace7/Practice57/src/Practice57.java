import java.util.Scanner;

public class Practice57 {

	public static void main(String[] args) {
		BankAccount b0 = new BankAccount();
		b0.setName("�赿��");
		b0.setBalance(100);
		b0.setInterest(3.1);
		
		BankAccount b1 = new BankAccount("ȫ�浿",500);
		b1.setInterest(2.15);
		
		BankAccount b2 = new BankAccount("������", 500, 2.05);
		
		String s0 = b0.toString();
		String s1 = b1.toString();
		String s2 = b2.toString();
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� " + b1.getAccountNo() + "���� ���� " + b2.getAccountNo() + "����\n�۱��� �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		sc.close();
		boolean success = BankAccount.transfer(b1, b2, money);
		if(success == true)
			System.out.printf("�۱��� �����߽��ϴ�.");
	}

}
