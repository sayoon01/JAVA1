import java.util.Scanner;

public class Practice57 {

	public static void main(String[] args) {
		BankAccount b0 = new BankAccount();
		b0.setName("김동덕");
		b0.setBalance(100);
		b0.setInterest(3.1);
		
		BankAccount b1 = new BankAccount("홍길동",500);
		b1.setInterest(2.15);
		
		BankAccount b2 = new BankAccount("성춘향", 500, 2.05);
		
		String s0 = b0.toString();
		String s1 = b1.toString();
		String s2 = b2.toString();
		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌 " + b1.getAccountNo() + "에서 계좌 " + b2.getAccountNo() + "으로\n송금할 금액을 입력하세요 : ");
		int money = sc.nextInt();
		sc.close();
		boolean success = BankAccount.transfer(b1, b2, money);
		if(success == true)
			System.out.printf("송금이 성공했습니다.");
	}

}
