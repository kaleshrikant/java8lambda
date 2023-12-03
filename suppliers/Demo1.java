package suppliers;

import java.util.Date;
import java.util.function.Supplier;

// supplier  program to demonstrate get() function.

public class Demo1 {
    public static void main(String[] args) {
        
        Supplier<Date> supplier = () -> new Date();
            System.out.println(supplier.get());  // Sun Dec 03 15:26:33 IST 2023
    }
}
