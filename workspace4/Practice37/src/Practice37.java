public class Practice37 {

	public static void main(String[] args) {
		Plane obj1 = new Plane();
		Plane obj2 = new Plane();
		Plane obj3 = new Plane();
		
		obj1.id = 0;
		obj2.id = 1030615;
		obj3.id = 2464737;
		
		obj1.model = "��";
		obj2.model = "���� 737";
		obj3.model = "���� 747";
		
		obj1.capacity = 0;
		obj2.capacity = 75;
		obj3.capacity = 150;
		
		System.out.println("����Ʈ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ : " + obj1.id + "��");
		System.out.println("�� : " + obj1.model);
		System.out.println("�°��� : " + obj1.capacity + "��");
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ : " + obj2.id + "��");
		System.out.println("�� : " + obj2.model);
		System.out.println("�°��� : " + obj2.capacity + "��");
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ : " + obj3.id + "��");
		System.out.println("�� : " + obj3.model);
		System.out.println("�°��� : " + obj3.capacity + "��");
	}
	
}