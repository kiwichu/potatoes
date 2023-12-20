package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        int[] nums = new int[5];
        //you can use ArrayList or just List
        List<Integer> arrayList = new ArrayList<>();
        //arraylists have no limit

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(3);

        for (int num: arrayList){
            System.out.println(num);

        }
       // arrayList.clear();
        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.contains(1));
        arrayList.add(3);
        arrayList.add(3,5);

        List<String> names = new LinkedList<>();
        names.add("ABC");
        names.add("XYZ");
        names.add("DEF");

        //when you use list you must use reference type

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("China");

    }

}
