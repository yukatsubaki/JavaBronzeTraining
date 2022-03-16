class Foo{
	int[] method(int a, int b){
	int[] data = {a,b};
	return data;
	}
} 

class Test6_4{
	public static void main(String[] args){
		Foo obj = new Foo();
		int[] array = obj.method(100,200);
		System.out.println(array[0] + " " + array[1]);
	}
}
