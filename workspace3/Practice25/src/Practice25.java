import java.util.Scanner;

public class Practice25 {

   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		printTimes(num);
		sc.close();
	}
	
	public static void printTimes(int n) {
		if(n>0) {
			System.out.println("구구단 " + n + "단입니다.");
			for(int i=1; i<=9; i++) {
				System.out.println(n + " * " + i + " = " + n*i);
			}
		}
		else {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
	}
	
	
	
}
