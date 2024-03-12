import java.util.Scanner;

public class Practice79 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BodyData b1 = getBodyDataInstance(s);
		BodyData b2 = getBodyDataInstance(s);
		
		printHeightMsg(b1,b2);
		printDietMsg(b1);
		printDietMsg(b2);
		
		s.close();
		
	}
	
	public static BodyData getBodyDataInstance(Scanner s)
	{
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = s.next();
		System.out.print("Ű�� �Է��ϼ��� : ");
		int height = s.nextInt(); 
		System.out.print("�����Ը� �Է��ϼ��� : ");
		int weight = s.nextInt();
		
		BodyData obj = new BodyData();
		obj.setName(name);
		obj.setHeight(height);
		obj.setWeight(weight);
		return obj;
	}

	private static BodyData compareHeight(BodyData b1, BodyData b2)
	{
		if(b1.getHeight() > b2.getHeight())
			return b1;
		else
			return b2;
	}
	public static void printHeightMsg(BodyData b1, BodyData b2)
	{
		BodyData obj = new BodyData();
		obj = compareHeight(b1,b2);
		System.out.println("Ű�� " + obj.getName() + "�� �� Ů�ϴ�.");
	}
	public static void printDietMsg(BodyData d)
	{
		boolean flag = d.needDiet();
		if(flag)
			System.out.println(d.getName() + "�� ���̾�Ʈ�� �ʿ��մϴ�.");
		else
			System.out.println(d.getName() + "�� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
	}
}