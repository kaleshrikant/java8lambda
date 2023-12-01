// Program for demonstrate Functional Interface accepting two input arguments and return.

@FunctionalInterface
interface Ride {
    public String bookRide(String source, String destination);
}
/*
class InnerTest3 implements Ride{
    public String bookRide(String source, String destination) {
        System.out.println("Rapido rikshaw is booked from "+source+" to "+destination);
        return("Fare : $500 ");
    }
}
 */

public class Test3 {
    public static void main(String[] args) {
        Ride ride = (source, destination) -> {
            System.out.println("Rapido rikshaw is booked from "+source+" to "+destination);
            return("Fare : $500 ");
        };

        System.out.println(ride.bookRide("Akola", "Amravati"));
    }
}