package kapilit;

import java.util.*;

public class treeMap {

	    public static void main(String[] args) {
	        
	        TreeMap<Integer, String> map = new TreeMap<>();

	        
	        map.put(101, "raj");
	        map.put(105, "ravi");
	        map.put(103, "ram");
	        map.put(102, "raju");

	        
	        Set<Integer> keySet = map.keySet();

	        System.out.println("Set view of keys: " + keySet);
	    }
	}

