class Test6_5{
	public static void main(String[] args){
		int x = 5;
		Test6_5 t = new Test6_5();
		t.go(x);
		System.out.println("main:x =" + x);
	}
	void go(int x){
		System.out.println("go:x =" + x++);
	}
}
