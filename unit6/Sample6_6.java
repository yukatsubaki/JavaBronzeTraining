class Test{
	int instanceVal = 100;
	static int staticVal = 200;
	void methodA(){System.out.println("methodA():" + instanceVal);}
	static void methodB(){System.out.println("methodB():" + staticVal);}
}

class Sample6_6{
	public static void main(String[] args){
		System.out.println(Test.staticVal);
		Test.methodB();
		Test t = new Test();
		System.out.println(t.instanceVal);
		System.out.println(t.staticVal);
		t.methodA();
		t.methodB();
	}
}	
