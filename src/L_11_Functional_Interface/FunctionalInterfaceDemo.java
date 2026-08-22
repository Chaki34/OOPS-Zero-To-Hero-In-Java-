package L_11_Functional_Interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Functional Interfaces (Java 8, 2014): They were officially defined with the release of Java 8 to support
 * lambda expressions and method references. Java 8 introduced the @FunctionalInterface annotation and an
 * entire package of built-in functional interfaces inside java.util.function.
 * Common examples:
 * Runnable → run()
 * Comparator → compare()  list.sort()
 * Callable → call()

 *** Functional Interface = one abstract method + supports lambda expressions ***
 *
 *
 */

@FunctionalInterface
interface Calculator {

    int calculate(int a , int b);
}



public class FunctionalInterfaceDemo {

    public static void main(String [] args){

        List<Integer> numbers = new ArrayList<>(Arrays.asList(50,35,21,45,12,5,3,6,6,3,5));

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer a, Integer b) {
//
//                return a - b;
//
//            }
//        };
//

        Comparator<Integer> comparator = (a,b) -> a - b;

        numbers.sort(comparator);
        System.out.println(numbers);


        Calculator add = (a , b) -> a + b;

        Calculator mul = (a , b) -> a * b;

        System.out.println();

        System.out.println(add.calculate(10,20));
        System.out.println(mul.calculate(10,20));

    }
}
