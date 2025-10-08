package kapilit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listToArray {

	public static void main(String[] args) {
		
		
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        String[] fruitArray = fruits.toArray(new String[0]);

        System.out.println("Array: " + Arrays.toString(fruitArray));
	}

}
