import java.util.Scanner;

public class Practice56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie m1 = new Movie();
		System.out.println("��ȭ ������ �Է��ϼ��� : ");
		System.out.print("���� ? ");
		m1.setTitle(sc.next());
		System.out.print("���� ?");
		m1.setDirector(sc.next());
		System.out.print("�⵵ ?");
		m1.setYear(sc.nextInt());
		
		Movie m2 = new Movie();
		System.out.println("��ȭ ������ �Է��ϼ��� : ");
		System.out.print("���� ? ");
		m2.setTitle(sc.next());
		System.out.print("���� ?");
		m2.setDirector(sc.next());
		System.out.print("�⵵ ?");
		m2.setYear(sc.nextInt());
		
		String rslt = Movie.compareMovies(m1, m2);
		System.out.println(rslt);
		
		sc.close();
	}

}