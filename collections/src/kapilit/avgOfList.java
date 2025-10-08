package kapilit;

import java.util.ArrayList;
import java.util.List;

public class avgOfList {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        System.out.println("List of numbers: " + numbers);

      
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

       
        double average = 0;
        if (!numbers.isEmpty()) {
            average = sum / numbers.size();
        }

      
        System.out.println("Average of numbers: " + average);
	}

}
