import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요: ");
		double x = sc.nextDouble();
		
		double rslt; // 초기화?? double rslt = 0;
		if (x > 0)
		{
			rslt = 7*x + 2;
		}
		else 
		{
			rslt = x*x*x - 9*x + 2;
		}
		
		System.out.println("f(x) = " + rslt);
		
		sc.close();
	}

}
