package kapilit;

import java.util.ArrayList;

public class arrayListdemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
        
        al.add(10); 
        al.add(1); 
        al.add(11); 
        al.add(2);
        al.add(null);
        al.add(2, 100);
        
        System.out.println(al);
	}

}
;