import java.util.Random;

public class Practice51 {

	public static void main(String[] args) {
		int cnt1 = 0, cnt2 = 0;
		
		Random rg = new Random();
		
		for(int i = 0; i < 10000; i++)
		{
			int n = rg.nextInt(9000) + 1000;
			
			System.out.print(n);
			if(n == 1000) {
				System.out.print("*");
				cnt1++;
			}
			else if (n == 9999) {
				System.out.print("#");
				cnt2++;
			}
			System.out.print("\t");
			
			if((i+1) % 10 == 0)
				System.out.println();
		}
		
		System.out.println("# of 1000 : " + cnt1);
		System.out.println("# of 9999 : " + cnt2);
	}

}
