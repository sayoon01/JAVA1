import java.util.Random;
import java.util.Scanner;
public class Practice78 {
	public static void main(String[] args) {
		Random rg = new Random();
		
		BankAccount obj1 = new BankAccount();
		BankAccount obj2 = new BankAccount();
		BankAccount obj3 = new BankAccount();
		
		obj1.setName("�赿��");
		obj1.setAccountNo((rg.nextInt(9000)+1000)+"-"+(rg.nextInt(9000)+1000));
		obj1.setBalance(600);
		obj1.setRate(3.1);
		
		obj2.setName("ȫ�浿");
		obj2.setAccountNo((rg.nextInt(9000)+1000)+"-"+(rg.nextInt(9000)+1000));
		obj2.setBalance(500);
		obj2.setRate(2.15);
		
		obj3.setName("������");
		obj3.setAccountNo((rg.nextInt(9000)+1000)+"-"+(rg.nextInt(9000)+1000));
		obj3.setBalance(500);
		obj3.setRate(2.05);
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� " +obj2.getAccountNo()+"���� ���� " +obj3.getAccountNo()+"���� �۱��� �ݾ��� �Է��ϼ��� : ");
		int amount = sc.nextInt();
		sc.close();
		if(obj2.transfer(obj3,amount))
			System.out.println("�۱ݿ� �����ϼ̽��ϴ�.");
		else
			System.out.println("�۱ݿ� �����ϼ̽��ϴ�.");
		
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	}

}