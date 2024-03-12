public class Practice62 {

	public static void main(String[] args) {
		//Box b0 = new Box();
		//Box b1 = new Box();
		//Box b2 = new Box(100, 60, 20);
		
		//b1.setX(30);
		//b1.setY(45);
		//b1.setZ(53);
		//b1.fillBox();	
	
		MeterialBox box1 = new MeterialBox(2, 3, 4, "wood");
		MeterialBox box2 = new MeterialBox(10, 5, 5, "paper");
		
		box1.printInfo();
		box2.printInfo();
		//String s0 = b0.toString();
		//System.out.println("디폴트 상자의 정보입니다.");
		//System.out.println(s0);
		//String s1 = b1.toString();
		//System.out.println("첫 번째 상자의 정보입니다.");
		//System.out.println(s1);
		//String s2 = b2.toString();
		//System.out.println("두 번째 상자의 정보입니다.");
		//System.out.println(s2);

	}

}
