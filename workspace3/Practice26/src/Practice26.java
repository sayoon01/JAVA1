import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1) + "��° ���ڸ� �Է��ϼ��� : ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("�Էµ� ���ڴ� ������ �����ϴ�");	
		for(int i=0; i<num.length; i++) {
			System.out.print( num[i] + " ");
		}
		System.out.println();
		
		System.out.println("���� ����Դϴ�.");
		for(int i=0; i<num.length; i++) {
			System.out.print( num[num.length-1-i] + " ");
		}
		System.out.println();
		
		int max = findMax(num);
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
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
