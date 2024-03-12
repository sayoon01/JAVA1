import java.util.Scanner;

public class Practice41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.print("가로 입력 : ");
		rec.width = sc.nextInt();
		System.out.print("세로 입력 : ");
		rec.height = sc.nextInt();
		
		sc.close();
		
		System.out.println("면적은 " + rec.area() + "입니다.");
		System.out.println("둘레는 " + rec.perimeter() + "입니다.");
	}

}
