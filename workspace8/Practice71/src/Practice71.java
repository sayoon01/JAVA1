public class Practice71{

	public static void main(String[] args) {	
		Circle obj = new Circle(10);
		System.out.println("������ : " + obj.getRadius());
		System.out.println("�ܸ��� : " + obj.getArea());
		
		Cylinder c1 = new Cylinder(0,0);
		System.out.println("������ : " + c1.getRadius());
		System.out.println("�ܸ��� : " + c1.getArea());
		System.out.println("���� : " + c1.getHeight());
		System.out.println("���� : " + c1.getVolume());
		
		Cylinder c2 = new Cylinder(5,3);
		System.out.println("������ : " + c2.getRadius());
		System.out.println("�ܸ��� : " + c2.getArea());
		System.out.println("���� : " + c2.getHeight());
		System.out.println("���� : " + c2.getVolume());
	}

}