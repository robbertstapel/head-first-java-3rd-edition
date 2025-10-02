package deepdive;

import java.util.HashMap;

public class MapAndHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> empIds = new HashMap<>();
        empIds.put(1, "Robbert");
        empIds.put(2, "John");

        System.out.println(empIds.get(1));

        boolean containsKey = empIds.containsKey(2);
        System.out.println(containsKey);

        boolean containsValue = empIds.containsValue("Robbert");
        System.out.println(containsValue);

        empIds.put(1, "Robbert2");
        System.out.println(empIds.get(1));
    }
}
