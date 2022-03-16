class Employee{
	private int id;
	public Employee(int i){id = i;}
	public int getId(){return id;}
}

public class Sample6_8{
	public static void main(String[] args){
		Employee emp = new Employee(100);
		System.out.println("public指定のメソッドへアクセス：" + emp.getId());
		System.out.println("private指定のインスタンス変数へアクセス：" + emp.id);
	}
}
