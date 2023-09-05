package se.lexicon.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        ex6();
    }


    // Terminal Operation -> count()
    public static void ex1() {
        Stream<String> skills = Stream.of("Java", "C#", "Python", "C++");
        long result = skills.count();
        System.out.println(result);
    }

    // Terminal Operation -> max & min
    public static void ex2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(100);
        numbers.add(1);
        numbers.add(12);
        numbers.add(100000);
        numbers.add(20000);
        //    int compare(T o1, T o2);
        Comparator<Integer> integerComparatorL = (n1, n2) -> n1.compareTo(n2);
        Comparator<Integer> integerComparatorM = Integer::compareTo;

        Optional<Integer> optionalInteger = numbers.stream().max(integerComparatorL);
        if (optionalInteger.isPresent()) {
            System.out.println("Max element number is : " + optionalInteger.get());
        }


    }

    public static void ex4() {
        Person person1 = new Person("Tobias", "Enbarg", Gender.MALE, LocalDate.parse("1999-02-02"));
        Person person2 = new Person("Marcus", "Gudmundsen", Gender.MALE, LocalDate.parse("1998-03-02"));
        Person person3 = new Person("Simon", "Elbrink", Gender.MALE, LocalDate.parse("1997-01-02"));

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // find person -> its Gender is Female

        // step1: make stream
        // step2: use Intermediate Operation to make a smaller stream -> filter
        // step3: use Terminal Operation to make a new result -> toList
       List<Person> filteredByFemaleGender = people.stream()
                .filter( (p)-> p.getGender().equals(Gender.FEMALE))
                .toList();
        System.out.println(filteredByFemaleGender);

    }

    public static void ex5() {
        Person person1 = new Person("Tobias", "Enbarg", Gender.MALE, LocalDate.parse("1999-02-02"));
        Person person2 = new Person("Marcus", "Gudmundsen", Gender.MALE, LocalDate.parse("1998-03-02"));
        Person person3 = new Person("Simon", "Elbrink", Gender.MALE, LocalDate.parse("1997-01-02"));

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // lambda
        people.stream()
                .sorted( (p1,p2) -> p1.getBirthDate().compareTo(p2.getBirthDate()))
                .forEach(person -> System.out.println(person));


        // method reference
        people.stream()
                .sorted(Comparator.comparing(Person::getBirthDate))
                .forEach(System.out::println);





    }



    public static void ex6() {
        Person person1 = new Person("Tobias", "Enbarg", Gender.MALE, LocalDate.parse("1999-02-02"));
        Person person2 = new Person("Marcus", "Gudmundsen", Gender.MALE, LocalDate.parse("1998-03-02"));
        Person person3 = new Person("Simon", "Elbrink", Gender.MALE, LocalDate.parse("1997-01-02"));

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);


        List<String> peopleNames = people.stream().map( person -> person.getFirstName() + " " +person.getLastName() ).toList();
        System.out.println(peopleNames);



    }





}
