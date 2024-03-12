package planet;

public class C {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		//System.out.println(aobj.prv); // private소속멤버는 다른 클래스에서 직접 접근 안됌
		
		F fobj = new F();
		fobj.accessTest();
	}
}
