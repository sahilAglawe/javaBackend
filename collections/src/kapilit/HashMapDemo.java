package kapilit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(1,"sahil");
		hm.put(2,"mohan");
		hm.put(3,"vinod");
		hm.put(4,"mahesh");
		hm.put(5,"shri");
		
		
		Set<Integer> s = hm.keySet();
		
		Iterator<Integer> itr = s.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("The key is " + i +" associated with the value " + hm.get(i));
		}
		
		
	/*	using for each loop
	 * for(Integer i : hm.keySet(i))
			System.out.println(i + " " + hm.get(i));  */
			}

}
