package se.lexicon.utilExamples;

import java.util.function.Function;

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



    }

}
