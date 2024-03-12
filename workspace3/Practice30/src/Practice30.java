import java.util.Random;

public class Practice30 {
	public static void main(String[] args) {
		int[] data = getData(20);
		
		displayArray(data);
		int max = findMax(data);
		System.out.println("가장 큰 숫자는 " + max + "입니다.");
	}
	
	public static void displayArray(int[] data) {
		for(int i=0; i<data.length; i++) 
		{
			System.out.print(data[i] + "\t");
			
			if((i+1)%10 == 0) 
			{
				System.out.println("");
			}
		}
	}
	
	public static int findMax(int[] data) {
		int max=data[0];
		for(int i=1; i<data.length; i++) 
		{
			if(max<data[i])
				max=data[i];
		}
		return max;
	}
	
	public static int[] getData(int num) {
		int[] rslt = new int[num];
		
		Random r = new Random();
		for(int i=0; i<rslt.length; i++)
		{
			rslt[i] = r.nextInt(100);
		}
		return rslt;
	}
}