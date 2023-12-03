package consumers;

import java.util.function.Consumer;

// consumer program to demonstrate accept() function.

public class Demo1 {
    public static void main(String[] args) {
        Consumer<String> consumer = c -> System.out.println(c);
            consumer.accept("WelCome");
    }
}
