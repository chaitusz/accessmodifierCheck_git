package package2;

import package1.A;

public class C extends A {
	
	public static void main(String[] args) {
		
		C c = new C();
	System.out.println(c.i);
	System.out.println(c.k);
	
	c.test1();
	c.test3();
	
	A a = new C();
	System.out.println(a.i);
	
	a.test1();
		
	}

	
	
	
	
	

}
