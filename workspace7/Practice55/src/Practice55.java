import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date d1 = new Date();
		System.out.println("첫 번째 날짜를 입력하세요.");
		/*System.out.print("년도 : ");
		d1.setYear(sc.nextInt());
		System.out.print("월 : ");
		d1.setMonth(sc.nextInt());
		System.out.print("일 : ");
		d1.setDay(sc.nextInt());*/
		String s1 = d1.toString();
		System.out.println(s1);
		
		System.out.println("두 번째 날짜를 입력하세요.");
		/*System.out.print("년도 : ");
		System.out.print("월 : ");
		System.out.print("일 : ");*/
		Date d2 = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		String s2 = d2.toString();
		System.out.println(s2);
		sc.close();
		
		int rslt = Date.compareDate(d1, d2);
		if(rslt == -1)
			System.out.println("첫 번째 날짜인 " + d1.toString() + "이 앞선 날짜입니다.");
		else if (rslt == 1)
			System.out.println("두 번째 날짜인 " + d2.toString() + "이 앞선 날짜입니다.");
		else 
			System.out.println("두 날짜는 같은 날짜입니다.");
	}

}
