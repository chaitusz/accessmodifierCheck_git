package package1;

public class A {
	
	public int i = 0 ; 
	private int j = 3;
	protected int k = 6; 
	int l = 9 ; 
	
	
	public void test1() {
		System.out.println("This is Public Method");
	}
	
	private void test2() {
		
		System.out.println("This is private method");
	}
	
	protected void test3() {
		System.out.println("This is protected method");
	}
	
	void test4() {
		System.out.println("This is Default method");
	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		System.out.println(a.l);
		
		a.test1();
		a.test2();
		a.test3();
		a.test4();
		
	
	}

}
