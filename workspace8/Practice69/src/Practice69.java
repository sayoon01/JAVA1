import java.util.Scanner;

public class Practice69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape obj1 = new Shape();
		System.out.println("도형 정보를 입력하세요");
		System.out.print("중심좌표의 X값 : ");
		obj1.setX(sc.nextInt());
		System.out.print("중심좌표의 Y값 : ");
		obj1.setY(sc.nextInt());
		
		Rectangle obj2 = new Rectangle();
		System.out.println("사각형 정보를 입력하세요");
		System.out.print("중심좌표의 X값 : ");
		obj2.setX(sc.nextInt());
		System.out.print("중심좌표의 Y값 : ");
		obj2.setY(sc.nextInt());
		System.out.print("가로길이 : ");
		obj2.setWidth(sc.nextInt());
		System.out.print("세로길이 : ");
		obj2.setHeight(sc.nextInt());
		
		System.out.println("만들어진 도형의 정보는 다음과 같습니다.");
		System.out.println(obj1.toString());
		obj2.printInfo();
	}

}
