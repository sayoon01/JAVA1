
public class Practice64 {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		d1.roll();
		int num1 = d1.getValue();
		d2.roll();
		int num2 = d2.getValue();
		
		int count = 1;
		while(num1!=num2)
		{
			System.out.println(count + "�� : " + "ù��° " + d1.toString() + ", �ι�° " + d2.toString());
			count++;
			d1.roll();
			d2.roll();
			num1 = d1.getValue();
			num2 = d2.getValue();
		}
		System.out.println(count + "�� : " + "ù��° " + d1.toString() + ", �ι�° " + d2.toString());
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}