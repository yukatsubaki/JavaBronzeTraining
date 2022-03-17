class Sample8_5{
	public static void main(String[] args){
		double a = 10.5;
		int c = (int)a;
		System.out.println("cの値は" + c + "デス");
		
		foo((short)c);
		
	}
	static void foo(short d){
		System.out.println("dの値は" + d + "です");
	}
}
