public class Practice53 {

	public static void main(String[] args) {
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("김동덕",100);
		BankAccount b2 = new BankAccount("홍길동", 2000, 2.15);

		String s0 = b0.toString();
		String s1 = b1.toString();
		String s2 = b2.toString();
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.print(s0);
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.print(s1);
		System.out.println("세 번째 은행 계좌의 정보입니다.");
		System.out.print(s2);
	}

}
