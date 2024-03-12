package universe;

import planet.A;

public class E {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		//System.out.println(aobj.pro); // protected는 다른 패키지 자식까지만 가능
		//System.out.println(aobj.def); // default 소속멤버 다른 패키지에서 접근 안됌
		//System.out.println(aobj.prv); // private소속멤버는 다른 클래스에서 직접 접근 안됌
		
		//F fobj = new F();
		//fobj.accessTest(); // default는 다른 패키지 안됌
	}
}
