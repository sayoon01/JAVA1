import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.close();
		for(int i=0; i<=num; i+=3)
		{
			System.out.print(i + "\t");
			
			if(i%5==2)
			{
				System.out.println();
			}
		}
		
	}

}
