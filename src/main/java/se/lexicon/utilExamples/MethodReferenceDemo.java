package se.lexicon.utilExamples;

import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class MethodReferenceDemo {

    public static int add(int a, int b) {
        return a + b;
    }

    public void displayMenu() {
        System.out.println("################");
        System.out.println("1. Register");
        System.out.println("2. Exit");
        System.out.println("################");
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer > additionL = (a,b) -> MethodReferenceDemo.add(a,b);
        BiFunction<Integer, Integer, Integer > additionM =  MethodReferenceDemo::add;


        MethodReferenceDemo objectName = new MethodReferenceDemo();

    }
}
