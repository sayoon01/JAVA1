import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String s = sc.next();
		
		switch(s)
		{
			case "a" :
			case "e" :
			case "i" :
			case "o" :
			case "u" :
			case "A" :
			case "E" :
			case "I" :
			case "O" :
			case "U" :
				System.out.println("�����Դϴ�.");
				break;
			default :
				System.out.println("�����Դϴ�.");
				break;
		}
		
		sc.close();
	}

}
