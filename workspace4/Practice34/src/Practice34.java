import java.util.Scanner;

public class Practice34 {

	public static void main(String[] args) {
		Rectangle rc1, rc2;
		rc1 = new Rectangle();
		rc2 = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력 : ");
		rc1.width = sc.nextInt();
		System.out.print("세로 입력 : ");
		rc1.height = sc.nextInt();
		System.out.println("두 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력 : ");
		rc2.width = sc.nextInt();
		System.out.print("세로 입력 : ");
		rc2.height = sc.nextInt();
		sc.close();
		
		System.out.println("첫 번째 사각형의 면적은 " + rc1.width*rc1.height + "입니다.");
		System.out.println("첫 번째 사각형의 둘레는 " + (rc1.width*2 + rc1.height*2) + "입니다.");
		System.out.println("두 번째 사각형의 면적은 " + rc2.width*rc2.height + "입니다.");
		System.out.println("두 번째 사각형의 둘레는 " + (rc2.width*2 + rc2.height*2) + "입니다.");
	}
}
