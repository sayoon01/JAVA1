public class Practice53 {

	public static void main(String[] args) {
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("�赿��",100);
		BankAccount b2 = new BankAccount("ȫ�浿", 2000, 2.15);

		String s0 = b0.toString();
		String s1 = b1.toString();
		String s2 = b2.toString();
		
		System.out.println("ù ��° ���� ������ �����Դϴ�.");
		System.out.print(s0);
		System.out.println("�� ��° ���� ������ �����Դϴ�.");
		System.out.print(s1);
		System.out.println("�� ��° ���� ������ �����Դϴ�.");
		System.out.print(s2);
	}

}
