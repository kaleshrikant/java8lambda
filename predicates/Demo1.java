package predicates;

import java.util.function.Predicate;

// Simple example for demoing Predicate

public class Demo1 {
    public static void main(String[] args) {
        // Ex. 1
        Predicate<Integer> predicate1 = i -> (i<20);
            System.out.println(predicate1.test(33));
            System.out.println(predicate1.test(3));

        // Ex. 2 : check the length of given string is greater than 4 or not.
        Predicate<String> predicate2 = string -> (string.length() > 4);
            System.out.println(predicate2.test("Welcome"));
            System.out.println(predicate2.test("xyz"));

        // Ex. 3 : Print array elemets whose size is > 4 
        String names [] = {"David", "Scott", "Smith", "John", "Mary"};
        for(String name : names) {
            Predicate<String> predicate3 = string -> (string.length() > 4);
            if(predicate3.test(name))
                System.out.println(name);
        }
    }
}
