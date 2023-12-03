package function;

import java.util.function.Function;

// Function program to demonstrate apply() function.

public class Demo1 {
    public static void main(String[] args) {
        Function<Integer,Integer> fun = n -> n*n;
            System.out.println(fun.apply(2));
            System.out.println(fun.apply(5));
            System.out.println(fun.apply(10));

        // Ex 2 : String length
        Function<String,Integer> f = s -> s.length();
            System.out.println(f.apply("Welcome"));
            System.out.println(f.apply("Java Programing"));
    }
}
