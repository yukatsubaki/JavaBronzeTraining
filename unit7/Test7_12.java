class Foo{
	protected static int method(int a,int b){
		return a * b;
	}
}

class Bar extends Foo{
	public static int method(int a, int b){
		int c = Foo.method(a,b);
		return c;
	}
}

class Test7_12{
	public static void main(String[] args){
		Bar b = new Bar();
		System.out.println(b.method(3,4) + " ");
		System.out.println(Bar.method(2,3));
	}
}
