class Employee{
	private String id = "100";
	public String getId(){
		return id;
	}
}

class Sales extends Employee{
	private String clientName = "SE";
	public String getClientName(){
		return clientName;
	}
}

class Sample7_1{
	public static void main(String[] args){
		Sales s = new Sales();
		System.out.println("clientName: " + s.getClientName());
		System.out.println("id: " + s.getId());
	}
}
