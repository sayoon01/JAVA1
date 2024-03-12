
public class Practice15 {

	public static void main(String[] args) {

		int i;
		for(i=1; i<= 100; i+=3)
		{
			System.out.print(i + "\t");
			
			if(i%5 == 3)
			{
				System.out.println();
			}
		}
		
		System.out.println("\n");
		
		i=1;
		while(i<=100)
		{
			System.out.print(i + "\t");
			
			if((i+2)%5 == 0)
			{
				System.out.print("\n");
			}
			
			i+=3;
		}

	}

}
