import java.util.Scanner;

public class Practice42 {

	public static void main(String[] args) {
		Date birthday = new Date();
		Date adultday = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birthday.setYear(sc.nextInt());
		adultday.setYear(birthday.year + 20);
		System.out.print("태어난 월을 입력하세요 : ");
		birthday.setMonth(sc.nextInt());
		adultday.setMonth(birthday.month);
		System.out.print("태어난 날짜를 입력하세요 : ");
		birthday.setDay(sc.nextInt());
		adultday.setDay(birthday.day);
		
		sc.close();
		
		System.out.println("당신의 생일은 " + birthday.toString());
		System.out.println("당신의 성년일은 " + adultday.toString());
		System.out.println("당신의 생일은 " + birthday.toString());
	}

}
