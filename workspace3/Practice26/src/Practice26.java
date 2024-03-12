import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요 : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("입력된 숫자는 다음과 같습니다");	
		for(int i=0; i<num.length; i++) {
			System.out.print( num[i] + " ");
		}
		System.out.println();
		
		System.out.println("역순 출력입니다.");
		for(int i=0; i<num.length; i++) {
			System.out.print( num[num.length-1-i] + " ");
		}
		System.out.println();
		
		int max = findMax(num);
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		sc.close();
	}
	
	public static int findMax (int[] n) {
		int maxNum=-8;
		
		for(int i=0; i<n.length; i++) {
			if(maxNum<n[i])
				maxNum=n[i];
		}
		return maxNum;
	}
}
