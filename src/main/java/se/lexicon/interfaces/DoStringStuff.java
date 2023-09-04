package se.lexicon.interfaces;

@FunctionalInterface
public interface DoStringStuff {

    // only define one abstract method
    String operate(String s1, String s2);

    // define a number of static and default methods
}
