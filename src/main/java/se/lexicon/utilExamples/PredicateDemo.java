package se.lexicon.utilExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

        /*
        Predicate<T>
         boolean test(T t);

            Use Cases:
                Filtering elements in a collection.
                Select elements from a Stream
                Writing more concise and expressive code when dealing with condition(if statements)
         */

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        // [1,2,3,4,5,6,7,8,9,10]
        System.out.println(numbers);


        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGraterThan18 = n -> n >= 18;
        Predicate<Integer> isLessThan18 = n -> n < 18;

        /*List<Integer> filteredList = new ArrayList<>();
        for (Integer element : numbers) {
            if (isEven.test(element)){
                filteredList.add(element);
            }
        }
        System.out.println(filteredList);  // [2,4,6,8,10]
         */

        System.out.println(filter(numbers, isEven));
        System.out.println(filter(numbers, isEven.negate()));


    }


    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate){
        List<Integer> result = new ArrayList<>();
        for (Integer element : numbers) {
            if (predicate.test(element)){
                result.add(element);
            }
        }
        return result;
    }


}
