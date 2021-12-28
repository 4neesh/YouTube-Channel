package methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        Person a = new Person("Albus", 30);
        Person b = new Person("Bellatrix", 20);
        Person c = new Person("Cornelius", 40);
        Person d = new Person("Draco", 50);

        List<Person> personList = Arrays.asList(a,b,c,d);
        personList.stream()
                .map(person -> person.getAge())
                .forEach(System.out::println);

        personList.stream()
                .map(Person::getAge)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("Daniel", "Rupert", "Emma");
        List<Person> newPersonList = names.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());

        List<Person> newPersonList2 = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());

        personList.forEach(b::printMyName);

    }
}
