import java.util.Scanner;

public class Practice40 {

	public static void main(String[] args) {
		String s;
		Date birthday = new Date();
		Date adultday = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birthday.year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요 : ");
		adultday.month = birthday.month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요 : ");
		adultday.day = birthday.day = sc.nextInt();
		
		sc.close();
		
		adultday.year = birthday.year + 20;
		
		s = birthday.toString();
		System.out.println("당신의 생일은 " + s);
		s = adultday.toString();
		System.out.println("당신의 성년일은 " + s);
		System.out.println("당신의 생일은 " + birthday.toString());
	}

}
