// Program for demonstrate Functional Interface.

@FunctionalInterface
interface Cab {
    public void bookCab();
}

/*
class Ola implements Cab {
    public void bookCab() {
        System.out.println("Ola cab is booked..");
    }
}
 */

public class Test1 {
    public static void main(String[] args) {
        
        Cab cab = () -> System.out.println("Ola cab is booked..");
        cab.bookCab();

    }
}