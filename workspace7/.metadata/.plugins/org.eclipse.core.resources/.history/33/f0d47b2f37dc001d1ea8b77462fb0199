import java.util.Scanner;
public class Practice59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal a = new Animal();
		System.out.println("Animal 객체 animal을 생성합니다.");
		System.out.println("사진에 추가할 문장을 입력하세요 : ");
		a.picture = sc.next();
		System.out.print("몸무게를 입력하세요 : ");
		a.setWeight(sc.nextDouble());
		a.eat();
		
		Lion buba = new Lion();
		System.out.println("Lion 객체 buba을 생성합니다.");
		System.out.println("사진에 추가할 문장을 입력하세요 : ");
		buba.picture = sc.next();
		System.out.print("몸무게를 입력하세요 : ");
		buba.setWeight(sc.nextDouble());
		buba.eat();
		System.out.print(" : ");
		buba.roar();
		
		Eagle paco = new Eagle();
		System.out.println("Eagle 객체 pack을 생성합니다.");
		System.out.println("사진에 추가할 문장을 입력하세요 : ");
		paco.picture = sc.next();
		System.out.print("몸무게를 입력하세요 : ");
		paco.setWeight(sc.nextDouble());
		paco.sleep();
		System.out.print(" : ");
		paco.fly();
		
		sc.close();
		
		System.out.println("Animal 객체 animal의 정보입니다.");
		String s1 = a.toString();
		System.out.print(s1);
		System.out.println("Lion 객체 buba의 정보입니다.");
		String s2 = buba.toString();
		System.out.print(s2);
		System.out.println("Eagle 객체 paco의 정보입니다.");
		String s3 = paco.toString();
		System.out.print(s3);
	}

}
