package se.lexicon.utilExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    /*
    Consumer<T>
     void accept(T t);

    Use Cases:
        Printing elements of a collection
        Modifying elements in a collection
        Performing actions on elements during iteration.
     */
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account("DEV1", Role.ROLE_USER);
        account1.activate();
        Account account2 = new Account("DEV2", Role.ROLE_USER);
        Account account3 = new Account("DEV3", Role.ROLE_USER);
        account3.activate();
        Account account4 = new Account("MANAGER1", Role.ROLE_ADMIN);
        Account account5 = new Account("MANAGER2", Role.ROLE_ADMIN);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        System.out.println("---------------------");
        Consumer<Account> printAccountInfo = (account) -> System.out.println(account.getUsername() + " " + account.getRole());
        Consumer<Account> printAccountDetails = (account) -> System.out.println(account.toString());
        //Consumer<Account> activateAccount = account -> account.activate();

        accounts.forEach(printAccountInfo);
        System.out.println("----------------------");
        accounts.forEach(printAccountDetails);
        System.out.println("----------------------");
        accounts.forEach(account -> account.activate());
        System.out.println("----------------------");
        accounts.forEach(printAccountDetails);





    }
}
