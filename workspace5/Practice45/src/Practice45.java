import java.util.Scanner;

public class Practice45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		System.out.print("사각형의 가로 : ");
		rec.setWidth(sc.nextInt());
		System.out.print("사각형의 세로 : ");
		rec.setHeight(sc.nextInt());
		
		sc.close();
		
		System.out.println("사각형의 가로는 " + rec.getWidth() + ", 세로는 " + rec.getHeight() + "입니다.");
		System.out.println("사각형의 넓이는 " + rec.area() + "이고, " + "둘레는 " + rec.perimeter() + "입니다.");
	}
}
