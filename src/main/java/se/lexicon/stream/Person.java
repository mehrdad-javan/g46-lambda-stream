package se.lexicon.stream;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private boolean status;

    public Person(String firstName, String lastName, Gender gender, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", status=" + status +
                '}';
    }
}
