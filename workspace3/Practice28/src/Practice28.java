import java.util.Scanner;

public class Practice28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] iArray = new int[10];
		
		for(int i=0; i<iArray.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요 : ");
			iArray[i] = sc.nextInt();
		}	
		
		displayArray(iArray);
		int max = findMax(iArray);
		System.out.println("가장 큰 숫자는 " + max + "입니다.");
		
		sc.close();
	}
	
	public static void displayArray(int[] iArray) {
		for(int i=0; i<iArray.length; i++) {
			System.out.print(iArray[i] + "\t");
		}
		System.out.println("");
	}
	
	public static int findMax(int[] iArray) {
		int max=iArray[0];
		for(int i=1; i<iArray.length; i++) {
			if(max<iArray[i])
				max=iArray[i];
		}
		return max;
	}
}
