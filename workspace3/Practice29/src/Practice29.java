import java.util.Random;

public class Practice29 {
	public static void main(String[] args) {
		Random rg = new Random();
		
		int[] iArray = new int[20];
		for(int i=0; i<iArray.length; i++) 
		{
			iArray[i]=rg.nextInt(100);
		}
		
		displayArray(iArray);
		int max = findMax(iArray);
		System.out.println("���� ū ���ڴ� " + max + "�Դϴ�.");
	}
	
	public static void displayArray(int[] iArray) {
		for(int i=0; i<iArray.length; i++) 
		{
			System.out.print(iArray[i] + "\t");
			
			if((i+1)%10 == 0) 
			{
				System.out.println("");
			}
		}
	}
	
	public static int findMax(int[] iArray) {
		int max=iArray[0];
		for(int i=1; i<iArray.length; i++) 
		{
			if(max<iArray[i])
				max=iArray[i];
		}
		return max;
	}
}