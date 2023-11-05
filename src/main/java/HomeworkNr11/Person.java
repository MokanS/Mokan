package HomeworkNr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Person {
String name;
String surname;
Integer age;
boolean isPayedByHour;

    public Person(String name, String surname, Integer age, boolean isPayedByHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
    }

    public static void main(String[] args) {
        List<Person> persons= new ArrayList<>();
        persons.add(new Person("Alexei", "Ivanov", 25,true));
       persons.add(new Person("Dmitrii", "Alexeev", 37,false));
       persons.add(new Person("Semion", "Dmitriev", 26,true ));
       persons.add(new Person("Serghei", "Semionov", 25,false ));
       persons.add(new Person("Andrei", "Sergheev", 37,true ));
        persons.add(new Person("Petr", "Andreev", 40,true ));
        persons.add(new Person("Vasili", "Petrov", 29,false ));
        persons.add(new Person("Maxim", "Vasiliev", 45,true ));
        persons.add(new Person("Anton", "Filatov", 36,false));
        persons.add(new Person("Igor", "Antonov", 19,true ));




        List<Person> result = persons.stream()
                .filter(e-> e.age>25 && e.isPayedByHour )
                .distinct()
                .limit(5)
                .collect(Collectors.toList());
           result.forEach(e-> {
               System.out.println(e.name + " " + e.surname);
           });
        System.out.println("------------------------");

        List<Person> personsWithAInSurname = persons.stream()
                .filter(person->person.surname.startsWith("A"))
                 .distinct()
                         .collect(Collectors.toList());
        personsWithAInSurname.forEach(person->{
            System.out.println(person.surname + " " + person.name);
        });

        System.out.println("------------------------");
        Optional<Person> personAge37 = persons.stream()
                .filter(a->a.age == 37)
                .findFirst();
        if (personAge37.isPresent()) {
            System.out.println("Первый человек которому 37 лет : " + personAge37.get().name + " " + personAge37.get().surname);
        }else {
            System.out.println("Такого человека нет!");
        }
    }
}
