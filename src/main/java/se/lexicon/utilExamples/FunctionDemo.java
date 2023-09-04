package se.lexicon.utilExamples;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {

    public static void main(String[] args) {
        String[] strings = {"I", "Love", "Java!"};

        Function<String[], String> arrayToString = array -> {
            String result = "";
            for (String element: array){
                result = result + element;
            }
            return result;
        };

        System.out.println(arrayToString.apply(strings));

        Function<Account, String> extractUserPass = (account) -> account.getUsername() + " " + account.getPassword();

        Account account = new Account("user",Role.ROLE_USER);
        System.out.println(extractUserPass.apply(account));


        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("abcdefgh"));
        UnaryOperator<String> toUpperCase2 = str -> str.toUpperCase();
        System.out.println(toUpperCase2.apply("abcdefgh"));




    }

}
