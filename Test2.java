// Program for demonstrate Functional Interface accepting two input arguments.


@FunctionalInterface
interface Taxi {
    public void bookTaxi(String source, String destination);
}

/*
class Uber implements Taxi {
    public void bookTaxi(String source, String destination) {
        System.out.println("Uber taxi is booked from "+source+" to "+destination);
    }
}
 */

public class Test2 {
    public static void main(String[] args) {
        Taxi taxi = (source, destination) -> System.out.println("Uber taxi is booked from "+source+" to "+destination);            
            taxi.bookTaxi("Amravai", "Akola");
    }
}
