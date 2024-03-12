import java.util.Scanner;

public class Practice46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie obj = new Movie();
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화 제목은 ?");
		obj.setTitle(sc.next());
		System.out.print("평점은 ?");
		obj.setScore(sc.nextInt());
		System.out.print("감독은 ?");
		obj.setDirector(sc.next());
		System.out.print("개봉 년도는 ?");
		obj.setYear(sc.nextInt());
		
		sc.close();
		
		System.out.println("입력한 영화의 정보입니다.");
		String s = obj.toString();
		System.out.print(s);
	}

}
