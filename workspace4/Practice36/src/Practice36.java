import java.util.Scanner;

public class Practice36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie obj1, obj2;
		obj1 = new Movie();
		obj2 = new Movie();
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화 제목은 ?");
		obj1.title = sc.next();
		System.out.print("평점은 ?");
		obj1.score = sc.nextInt();
		System.out.print("감독은 ?");
		obj1.director = sc.next();
		System.out.print("개봉 년도는 ?");
		obj1.year = sc.nextInt();
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("영화 제목은 ?");
		obj2.title = sc.next();
		System.out.print("평점은 ?");
		obj2.score = sc.nextInt();
		System.out.print("감독은 ?");
		obj2.director = sc.next();
		System.out.print("개봉 년도는 ?");
		obj2.year = sc.nextInt();
		
		sc.close();
		System.out.print("영화 " + obj1.title + "이 영화 " + obj2.title + "보다 평점이 ");
		if(obj1.score > obj2.score)
		{
			System.out.println("더 높습니다.");
		}
		else if(obj1.score < obj2.score)
		{
			System.out.println("같습니다.");
		}
		else
		{
			System.out.println("더 낮습니다.");
		}
		
		System.out.print("영화 " + obj1.title + "이 영화 " + obj2.title + "보다  ");
		if(obj1.year < obj2.year)
		{
			System.out.println("먼저 개봉되었습니다.");
		}
		else if(obj1.score > obj2.score)
		{
			System.out.println("나중에 개봉되었습니다.");
		}
		else
		{
			System.out.println("같은 년도에 개봉되었습니다.");
		}
	}
}
