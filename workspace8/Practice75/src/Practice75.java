import java.util.Scanner;

public class Practice75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bodydata my = new Bodydata();
		System.out.print("내 키를 입력하세요 : ");
		my.setHeight(sc.nextInt());
		System.out.print("내 몸무게를 입력하세요 : ");
		my.setWeight(sc.nextInt());
		
		Bodydata your = new Bodydata();
		System.out.print("당신의 키를 입력하세요 : ");
		your.setHeight(sc.nextInt());
		System.out.print("당신의 몸무게를 입력하세요 : ");
		your.setWeight(sc.nextInt());
		
		boolean flag = my.isTallerThan(your);
		if(flag == true)
			System.out.println("키는 내가 더 큽니다.");
		else 
			System.out.println("키는 당신이 더 큽니다.");
		
		if(my.needDiet() == true)
			System.out.println("나는 다이어트가 필요합니다.");
		else
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		
		if(your.needDiet() == true)
			System.out.println("당신은 다이어트가 필요합니다.");
		else
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		
		sc.close();	
	}

}
