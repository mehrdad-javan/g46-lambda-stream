package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.DoubleOperator;
import se.lexicon.interfaces.IntRandom;
import se.lexicon.interfaces.Printer;

import java.util.Random;

public class LambdaDemo {
    static DoStringStuff concatOperator = (s1, s2) -> s1 + " " + s2;
    static DoStringStuff getBiggestString = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;
    static DoubleOperator additionOperator = (number1, number2) -> number1 + number2;
    static DoubleOperator subtractionOperator = (number1, number2) -> number1 - number2;

    public static double calcOperator(double n1, double n2, DoubleOperator operator) {
        return operator.apply(n1, n2);
    }

    public static String doStringStuff(String s1, String s2, DoStringStuff stringOperator) {
        return stringOperator.operate(s1, s2);
    }

    public static void main(String[] args) {

        // String operate(String s1, String s2);
        System.out.println(concatOperator.operate("Mehrdad", "Javan"));
        System.out.println(getBiggestString.operate("Mehrdad", "Javan"));
        System.out.println("-----------------------------");
        System.out.println(doStringStuff("Mehrdad", "Javan", concatOperator));
        System.out.println(doStringStuff("Mehrdad", "Javan", getBiggestString));
        System.out.println("-----------------------------");
        System.out.println(additionOperator.apply(12d, 10d));
        System.out.println(subtractionOperator.apply(12d, 10d));
        System.out.println("-----------------------------");
        System.out.println(calcOperator(10d, 5d, additionOperator));
        System.out.println(calcOperator(10d, 5d, subtractionOperator));
        System.out.println("-----------------------------");
        // int generate();
        IntRandom randomNumberOperator =  () -> new Random().nextInt();
        System.out.println(randomNumberOperator.generate());
        System.out.println("-----------------------------");
        Printer printMessage = message -> System.out.println(message);
        printMessage.print("Hello Lambda!");





    }

}
