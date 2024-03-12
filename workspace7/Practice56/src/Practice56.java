import java.util.Scanner;

public class Practice56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie m1 = new Movie();
		System.out.println("영화 정보를 입력하세요 : ");
		System.out.print("제목 ? ");
		m1.setTitle(sc.next());
		System.out.print("감독 ?");
		m1.setDirector(sc.next());
		System.out.print("년도 ?");
		m1.setYear(sc.nextInt());
		
		Movie m2 = new Movie();
		System.out.println("영화 정보를 입력하세요 : ");
		System.out.print("제목 ? ");
		m2.setTitle(sc.next());
		System.out.print("감독 ?");
		m2.setDirector(sc.next());
		System.out.print("년도 ?");
		m2.setYear(sc.nextInt());
		
		String rslt = Movie.compareMovies(m1, m2);
		System.out.println(rslt);
		
		sc.close();
	}

}
