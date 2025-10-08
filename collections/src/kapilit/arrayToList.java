package kapilit;

import java.util.Arrays;
import java.util.List;

public class arrayToList {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};

        List<String> fruitList = Arrays.asList(fruits);

        System.out.println("List: " + fruitList);
	}

}
