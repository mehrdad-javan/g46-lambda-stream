package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;

public class StringOperator implements DoStringStuff {

    @Override
    public String operate(String s1, String s2) {
        return s1 + " " + s2;
    }

}
