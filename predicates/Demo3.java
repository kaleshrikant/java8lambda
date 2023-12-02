package predicates;
// Joining Predicates -- and, or, negate

// p1 -- checks number is even
// p2 -- checks greater than 50

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        int arrayNums[] = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65 };

        Predicate<Integer> predicate1 = num -> (num % 2 == 0);
        Predicate<Integer> predicate2 = num -> (num > 50);

        // AND 
        Predicate<Integer> predicate3 = predicate1.and(predicate2);
        System.out.println("Following are numbers even AND Greater than 50..");
        for (int number : arrayNums) {
            if ((predicate3.test(number)))
                System.out.println(number);
        }

        // OR
        System.out.println("Following are numbers even OR Greater than 50..");
        for (int number : arrayNums) {
            if ((predicate1.or(predicate2).test(number)))
                System.out.println(number);
        }

        // NEGATE
        System.out.println("Following are numbers odd ..");
        for (int number : arrayNums) {
            if ((predicate1.negate()).test(number))
                System.out.println(number);
        }
    }
}
