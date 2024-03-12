import java.util.Scanner;
public class Practice54 {

	public static void main(String[] args) {
		Plane p0 = new Plane();
		String s0 = p0.toString();
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.print(s0);
		int n0 = Plane.getPlanes();
		System.out.println("현재까지 추가된 비행기는 모두 " + n0 + "대입니다.");
		
		Scanner sc = new Scanner(System.in);
		Plane p1 = new Plane();
		p1.setId(sc.nextInt());
		p1.setModel(sc.next());
		p1.setCapacity(sc.nextInt());
		String s1 = p1.toString();
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.print(s1);
		int n1 = Plane.getPlanes();
		System.out.println("현재까지 추가된 비행기는 모두 " + n1 + "대입니다.");
		sc.close();
		
		Plane p2 = new Plane(2464737,"보잉 747",150);
		String s2 = p2.toString();
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.print(s2);
		int n2 = Plane.getPlanes();
		System.out.println("현재까지 추가된 비행기는 모두 " + n2 + "대입니다.");
	}

}
