import java.util.Scanner;

public class Practice33 {

	public static void main(String[] args) {
		Rectangle rc = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력 : ");
		rc.width = sc.nextInt();
		System.out.print("세로 입력 : ");
		rc.height = sc.nextInt();
		sc.close();
		
		System.out.println("면적은 " + rc.width*rc.height + "입니다.");
		System.out.println("둘레는 " + (rc.width*2 + rc.height*2) + "입니다.");
	}

}
