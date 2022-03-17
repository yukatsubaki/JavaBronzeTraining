class Test6_15{
	private static int a;
	private int b;
	public static int methodA(){
		return ++a;
	}
	public int methodB(){
		return methodA();
	}
	public static void main(String[] args){
		Test6_15 obj = new Test6_15();
		System.out.println(obj.methodB() + " ");
		System.out.println(obj.methodA());
	}
}	
