package function;

import java.util.function.Function;

// Function program to demostrate Function-Chaining by usig andThen() amd compose() methods.

public class Demo3 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n * n;
        
        // andThen()
            System.out.println(f1.andThen(f2).apply(2)); // f1 --> f2 ==>  f1(2 * 2 = 4) --> f2(4 * 4 * 4 =64)
        
        // compose()
            System.out.println(f1.compose(f2).apply(2)); // f2 --> f1 ==>  f2(2 * 2 * 2 = 8) --> f1(8 * 2 =16)
    }
}
