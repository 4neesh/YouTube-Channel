package stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;

public class Application {

    public static void main(String[] args) {

        Collection<Person> peopleCollection = new ArrayList<>();
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new HashSet<>();
        Map<Integer, Person> peopleMap = new HashMap<>();

        peopleCollection.stream();
        peopleList.stream();
        peopleSet.stream();
        peopleMap.keySet().stream();

        Person a = new Person("Andy", 20, "Yellow");
        Person b = new Person("John", 30, "Blue");
        Person c = new Person("Eliza", 25, "Yellow");

        Stream<Person> personStream = Stream.of(a,b,c);
        Stream<Person> personStream2 = Stream.generate(() -> new Person("A", 10, "Orange"));
        Stream<Integer> stream3 = Stream.iterate(0, num -> num + 1);

        IntStream intStream = IntStream.range(0,10);
        IntStream intStream2 = IntStream.rangeClosed(0,10);
        DoubleStream doubleStream = DoubleStream.generate(() -> 1d);
        DoubleStream doubleStream2 = DoubleStream.of(1d, 2d, 3d);
        LongStream longStream = LongStream.range(0, 3l);

        peopleList.add(a);
        peopleList.add(b);
        peopleList.add(c);


            Map<String, Integer> personNameToAgeMap =
            peopleList.stream()
            .collect(Collectors.toMap(person -> person.getName(), person -> person.getAge()));

    }
}
