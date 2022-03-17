class Test6_8{
	static void func(int a,int b){
		System.out.println(a + b);
	}
	static void func(String a,String b){
		System.out.println(a + b);
	}
	public static void main(String[] args){
		func(10,20);
		func("a","b");
	}
}
