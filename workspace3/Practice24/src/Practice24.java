import java.util.Scanner;
public class Practice24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		printTimes(num);
		sc.close();
	}
	
	public static void printTimes(int n) {
		System.out.println("������ " + n + "���Դϴ�.");
		for(int i=1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}