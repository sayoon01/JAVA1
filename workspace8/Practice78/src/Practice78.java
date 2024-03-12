import java.util.Random;
import java.util.Scanner;
public class Practice78 {
	public static void main(String[] args) {
		Random rg = new Random();
		
		BankAccount obj1 = new BankAccount();
		BankAccount obj2 = new BankAccount();
		BankAccount obj3 = new BankAccount();
		
		obj1.setName("김동덕");
		obj1.setAccountNo((rg.nextInt(9000)+1000)+"-"+(rg.nextInt(9000)+1000));
		obj1.setBalance(600);
		obj1.setRate(3.1);
		
		obj2.setName("홍길동");
		obj2.setAccountNo((rg.nextInt(9000)+1000)+"-"+(rg.nextInt(9000)+1000));
		obj2.setBalance(500);
		obj2.setRate(2.15);
		
		obj3.setName("성춘향");
		obj3.setAccountNo((rg.nextInt(9000)+1000)+"-"+(rg.nextInt(9000)+1000));
		obj3.setBalance(500);
		obj3.setRate(2.05);
		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌 " +obj2.getAccountNo()+"에서 계좌 " +obj3.getAccountNo()+"으로 송금할 금액을 입력하세요 : ");
		int amount = sc.nextInt();
		sc.close();
		if(obj2.transfer(obj3,amount))
			System.out.println("송금에 성공하셨습니다.");
		else
			System.out.println("송금에 실패하셨습니다.");
		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	}

}
