package kapilit;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class unModifideSet {

	public static void main(String[] args) {
		
		Set<String> names = new LinkedHashSet<>();
		
		names.add("savi");
		names.add("shri");
		names.add("tarun");
		
		Set<String> hs = Set.of("sahil", "shri");
		hs.add("tarun");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
