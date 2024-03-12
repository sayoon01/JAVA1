package out;

import planet.*;
import universe.*;

public class T {
	public static void main(String[] args) {
		B bobj = new B();
		//bobj.accessTest(); // 접근 가능한 조건 이지만 accessTest함수가 존재 X
		
		E eobj = new E();
		//eobj.accessTest(); // 접근 가능 조건 BUT accessTest함수는 default기 떄문에 다른 패키지 접근 X
		
	//	F fobj = new F(); // F자체가 default class라서 접근 불가
	}
}
