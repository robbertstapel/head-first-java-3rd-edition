package deepdive;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Rob");
        names.add("Remove 1");
        names.add("Remove 2");
        System.out.println(names.size());
        System.out.println(names);

        if(names.contains("Rob")){
            System.out.println("Yes it has Rob");
        }

        if(!names.contains("Johnny")){
            System.out.println("No it does not have Johnny");
        }

        List<String> namesToRemove = List.of("Remove 1", "Remove 2");

        names.removeAll(namesToRemove);


//        names.clear();

        System.out.println("Last line: " + names);

    }
}
