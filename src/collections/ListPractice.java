package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListPractice {
    public static void main(String[] args) {

        Map<Integer, String> weekdays1 = new HashMap<>();
        weekdays1.put(1, "Monday");
        weekdays1.put(2, "Tuesday");
        weekdays1.put(3, "Wednesday");
        weekdays1.put(4, "Thursday");
        weekdays1.put(5, "Friday");
        weekdays1.put(6, "Saturday");
        weekdays1.put(7, "Sunday");

        for (int key : weekdays1.keySet()) {
            System.out.println(weekdays1.get(key));


        }
    }
}
