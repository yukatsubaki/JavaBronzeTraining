class Test6_18{
	static String lang = "C";
	public String operation = "Unix";
	Test(){}
	Test(String str){
		operation = str;
	}
	
	public static void main(String[] args){
		Test6_18 obj1 = new Test6_18();
		Test6_18 obj2 = new Test6_18("Solaris");
		obj2.lang = "Java";
		System.out.println(obj1.lang + "\t" + obj1.operation);
		System.out.println(obj2.lang + "\t" + obj2.operation);
	}
}
