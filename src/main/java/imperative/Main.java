package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Gender.*;

public class Main {
    public static void main(String[] args)
    {
        List<Person> people = List.of(
                new Person ("john", Male),
                new Person ("Maria", Female),
                 new Person ("ali", Male),
                 new Person ("chouchou", Female)
        );
//imperative aproach
        List<Person> females=new ArrayList<>();
        for ( Person person :people){
            if(Female.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female:females){
            System.out.println(female);
        }

        //declarative approach
        //List<Person> females02 =
                people.stream()
                .filter(person -> Female.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

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


