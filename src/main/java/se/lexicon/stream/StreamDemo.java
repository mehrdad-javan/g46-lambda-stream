package se.lexicon.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Tobias", "Enbarg", Gender.MALE, LocalDate.parse("1999-02-02"));
        Person person2 = new Person("Marcus", "Gudmundsen", Gender.MALE, LocalDate.parse("1998-03-02"));
        Person person3 = new Person("Simon", "Elbrink", Gender.MALE, LocalDate.parse("1997-01-02"));

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Predicate<Person> personPredicateStartNameWithM = (person) -> person.getFirstName().startsWith("M");

        List<Person> filteredListByName = people.stream() // source
                .filter(personPredicateStartNameWithM) // intermediate operation
                .toList(); // terminal operation

        Consumer<Person> printPersonData = p -> System.out.println(p);
        filteredListByName.forEach(printPersonData);


    }

}
