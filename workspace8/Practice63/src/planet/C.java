package planet;

public class C {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		//System.out.println(aobj.prv); // private�ҼӸ���� �ٸ� Ŭ�������� ���� ���� �ȉ�
		
		F fobj = new F();
		fobj.accessTest();
	}
}
