import java.util.Scanner;

public class Practice43 {

	public static void main(String[] args) {
		Date birthday = new Date();
		Date adultday = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birthday.setYear(sc.nextInt());
		int tmpYear = birthday.getYear() + 20;
		adultday.setYear(tmpYear);
		System.out.print("태어난 월을 입력하세요 : ");
		birthday.setMonth(sc.nextInt());
		adultday.setMonth(birthday.getMonth());
		System.out.print("태어난 날짜를 입력하세요 : ");
		birthday.setDay(sc.nextInt());
		adultday.setDay(birthday.getDay());
		
		sc.close();
		
		String s1 = birthday.toString();
		System.out.println("당신의 생일은 " + s1);
		String s2 = birthday.toString();
		System.out.println("당신의 성년일은 " + s2);
		System.out.println("당신의 생일은 " + s1);

	}

}
