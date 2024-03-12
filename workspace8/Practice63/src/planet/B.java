package planet;

public class B extends A {
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		//System.out.println(prv); // private소속멤버는 다른 클래스에서 직접 접근 안됌
	}
}
