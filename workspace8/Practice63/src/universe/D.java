package universe;

import planet.A;

public class D extends A{
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		//System.out.println(def);//  define �ҼӸ���� �ٸ� Ŭ�������� ���� ���� �ȉ�
		//System.out.println(aobj.prv); // private�ҼӸ���� �ٸ� Ŭ�������� ���� ���� �ȉ�
		
		//F fobj = new F();
		//fobj.accessTest(); // F�� default Ŭ���� �̹Ƿ� �ٸ� ��Ű������ �θ� �� ����.
	}
}
