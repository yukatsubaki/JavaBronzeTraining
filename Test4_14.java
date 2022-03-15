class Test4_14{
	public static void main(String[] args){
		char arry[] = {'a', 'A', 'B', 'T'};
		for(char c : arry){
			switch(c){
				case 'A':
					System.out.print("A ");
					break;
				case 'a':
					System.out.print("x ");
					break;
				case 'B':
					System.out.print("B ");
					break;
				case 'T':
					System.out.print("T ");
					break;
			}
		}
		System.out.println();
	}
}
