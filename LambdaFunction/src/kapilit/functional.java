package kapilit;

public interface functional {
	
	int show(int i , int j);
	default String display(String str) {
		
		System.out.println(str);
		return str+ "program";
	}

}
