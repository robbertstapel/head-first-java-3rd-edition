package deepdive;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("Rob");
        System.out.println(names);

        if(names.contains("Rob")){
            System.out.println("Yes it has Rob");
        }

        if(!names.contains("Johnny")){
            System.out.println("No it does not have Johnny");
        }

    }
}
