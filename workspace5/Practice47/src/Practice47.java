public class Practice47 {

	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount();
		BankAccount obj2 = new BankAccount();
		
		obj1.setName("�赿��");
		obj1.setAccountNo("1234-5678");
		obj1.setBalance(100);
		obj1.setRate(0.0);
		
		obj2.setName("ȫ�浿");
		obj2.setAccountNo("9999-2531");
		obj2.setBalance(2000);
		obj2.setRate(2.15);
		
		String s1 = obj1.toString();
		System.out.println("ù ��° ���� ������ �����Դϴ�." + s1);
		
		String s2 = obj2.toString();
		System.out.println("�� ��° ���� ������ �����Դϴ�." + s2);
		
	}

}