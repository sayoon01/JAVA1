package universe;

import planet.A;

public class E {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		//System.out.println(aobj.pro); // protected�� �ٸ� ��Ű�� �ڽı����� ����
		//System.out.println(aobj.def); // default �ҼӸ�� �ٸ� ��Ű������ ���� �ȉ�
		//System.out.println(aobj.prv); // private�ҼӸ���� �ٸ� Ŭ�������� ���� ���� �ȉ�
		
		//F fobj = new F();
		//fobj.accessTest(); // default�� �ٸ� ��Ű�� �ȉ�
	}
}
