class Foo{
	String name;
}

class Test8_10 extends Foo{
	Test8_10(String name){
		this.name = name;
	}
	void show(){
		System.out.println(name);
	}
	public static void main(String[] args){
		Foo obj = new Test8_10("hana");
		((Test8_10)obj).show();
	}
}
