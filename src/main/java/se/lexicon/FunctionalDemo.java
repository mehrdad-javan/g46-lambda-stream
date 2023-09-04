package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.DoubleOperator;

public class FunctionalDemo {

    static DoStringStuff concatOperator = new DoStringStuff() {
        @Override
        public String operate(String s1, String s2) {
            return s1 + " " + s2;
        }
    };

    static DoStringStuff getBiggestString = new DoStringStuff() {
        @Override
        public String operate(String s1, String s2) {
            return s1.length() >= s2.length() ? s1 : s2;
        }
    };

    static DoubleOperator additionOperator = new DoubleOperator() {
        @Override
        public Double apply(Double n1, Double n2) {
            return n1 + n2;
        }
    };

    static DoubleOperator subtractionOperator = new DoubleOperator() {
        @Override
        public Double apply(Double n1, Double n2) {
            return n1 - n2;
        }
    };

    static DoubleOperator multiplicationOperator = new DoubleOperator() {
        @Override
        public Double apply(Double n1, Double n2) {
            return n1 * n2;
        }
    };

    public static void main(String[] args) {

        //StringOperator concatOperator = new StringOperator();
        //System.out.println(concatOperator.operate("Mehrdad", "Javan"));


        System.out.println(concatOperator.operate("Mehrdad", "Javan"));
        System.out.println(getBiggestString.operate("ABCD", "ABCDEFGH"));
        System.out.println(additionOperator.apply(10d, 20d));
        System.out.println(subtractionOperator.apply(20d, 5d));


        System.out.println(calcOperator(20d, 40d, additionOperator));
        System.out.println(calcOperator(20d, 40d, subtractionOperator));
        System.out.println(calcOperator(20d, 40d, multiplicationOperator));

        System.out.println(doStringStuff("Mehrdad","Javan", concatOperator));
        System.out.println(doStringStuff("Mehrdad","Javan", getBiggestString));

    }

    public static double calcOperator(double n1, double n2, DoubleOperator operator) {
        return operator.apply(n1, n2);
    }

    public static String doStringStuff(String s1, String s2, DoStringStuff stringOperator) {
        return stringOperator.operate(s1, s2);
    }


}
