class Foo{
	Foo(){System.out.println("Hello");}
	private Foo(String str){System.out.println("bye");}
}
class Test6_10{
	public static void main(String[] args){
		Foo f = new Foo();
	}
}
