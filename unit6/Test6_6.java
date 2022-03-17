class Test6_6{
	int x = 50;
	int y = 100;

	public static void main(String[] args){
		int x = 0; int y = 10;
		Test6_6 t = new Test6_6();
		while( x < 3 ){
			x++; y--;	
		}
		System.out.println("x= " + x + "y= " + y);
	}
}
