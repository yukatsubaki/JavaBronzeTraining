class Test3_8{
	public static void main(String[] args){
		String str = "hello!";
		String str2 = "bye!";
		str += str2;
		str -= str2;

		if (str == str2){
			System.out.println("str = str2");
		} else {
			System.out.println("str != str2");
		}
	}
}
