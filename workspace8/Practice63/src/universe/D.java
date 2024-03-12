package universe;

import planet.A;

public class D extends A{
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		//System.out.println(def);//  define 소속멤버는 다른 클래스에서 직접 접근 안됌
		//System.out.println(aobj.prv); // private소속멤버는 다른 클래스에서 직접 접근 안됌
		
		//F fobj = new F();
		//fobj.accessTest(); // F는 default 클래스 이므로 다른 패키지에서 부를 수 없음.
	}
}
