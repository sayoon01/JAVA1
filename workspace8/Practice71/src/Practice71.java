public class Practice71{

	public static void main(String[] args) {	
		Circle obj = new Circle(10);
		System.out.println("반지름 : " + obj.getRadius());
		System.out.println("단면적 : " + obj.getArea());
		
		Cylinder c1 = new Cylinder(0,0);
		System.out.println("반지름 : " + c1.getRadius());
		System.out.println("단면적 : " + c1.getArea());
		System.out.println("높이 : " + c1.getHeight());
		System.out.println("부피 : " + c1.getVolume());
		
		Cylinder c2 = new Cylinder(5,3);
		System.out.println("반지름 : " + c2.getRadius());
		System.out.println("단면적 : " + c2.getArea());
		System.out.println("높이 : " + c2.getHeight());
		System.out.println("부피 : " + c2.getVolume());
	}

}
