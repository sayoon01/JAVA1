import java.util.Scanner;

public class Practice27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[5];
		for(int i=0; i<data.length; i++) 
		{
			System.out.print((i+1) + "��° ���ڸ� �Է��ϼ��� : ");
			data[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("�Էµ� ���ڴ� ������ �����ϴ�");	
		for(int i=0; i<data.length; i++) 
		{
			System.out.print( data[i] + " ");
		}
		System.out.println();
		
		System.out.println("���� ����Դϴ�.");
		for(int i=0; i<data.length; i++) 
		{
			System.out.print( data[data.length-1-i] + " ");
		}
		System.out.println();
		
		int max=data[0];
		for(int i=1; i<data.length; i++) 
		{
			if(max<data[i])
				max=data[i];
		}
		
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		for(int i = 0; i < data.length; i++)
		{
			count[data[i]]++;
		}
		
		System.out.println("���� ���� �Էµ� Ƚ���� ������ �����ϴ�");
		for(int i=0; i<count.length; i++) 
		{
			System.out.println("����" + i + ": " + count[i] + "��");
		}
		System.out.println("���� ū ���� " + max + "�̰� �迭 ���� " + count[max] + "�� ��Ÿ���ϴ�");
	}
	
}