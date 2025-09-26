package kapilit;

import java.util.ArrayList;
import java.util.Collections;

public class comparison {
    public static void main(String[] args) {
        ArrayList<projectManager> al = new ArrayList<>();

        
        projectManager p1 = new projectManager(123, "sahil", 20000);
        projectManager p2 = new projectManager(111, "mahesh", 25000);
        projectManager p3 = new projectManager(222, "vaibhav", 18000);

        al.add(p1);
        al.add(p2);
        al.add(p3);

          
        Collections.sort(al);

        for (projectManager pm : al) {
            System.out.println(pm);
        }
    }
}
