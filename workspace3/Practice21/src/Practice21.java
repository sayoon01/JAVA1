import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		sumXAndY(num1,num2);
		sumXAndY(num2,num1);
		sc.close();
	}
	
	public static void sumXAndY(int x,int y)
	{
		System.out.println(x + " + " + y + " = " + (x+y));
	}
}
