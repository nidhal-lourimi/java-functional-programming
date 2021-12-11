package Stream;

import imperative.Main;

import java.util.List;
import java.util.stream.Collectors;

import static Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("john", Male),
                new Person("Maria", Female),
                new Person("ali", Male),
                new Person("chouchou", Female)
        );

      /*  people.stream()
                .map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);*/


        people.stream().anyMatch(person -> Female.equals(person.gender));


    }

    static class Person {
        private final String name;
        private final Gender gender ;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
enum Gender{
    Male,Female
}


