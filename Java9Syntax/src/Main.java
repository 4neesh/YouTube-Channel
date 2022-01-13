import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("Anthony");
        namesList.add("Joshua");
        namesList.add("Tyson");
        namesList.add("Fury");

        List<String> namesList2 = List.of("Anthony", "Joshua", "Tyson", "Fury");
        Set<String> namesSet = Set.of("Anthony", "Joshua", "Tyson", "Fury");
        Map<String, Integer> nameToAge = Map.of("Aneesh", 26, "Jude", 18);


        System.out.println(namesList);
        System.out.println(namesList2);

        namesList.add("Aneesh");
        System.out.println(namesList);

        List<Integer> numbers = List.of(1,2,11,4,5,6,7,8,9, 10);
        System.out.println("Take while");
        numbers.stream().takeWhile(number -> number < 5)
                .forEach(System.out::println);

        System.out.println("Drop while");
        numbers.stream().dropWhile(number -> number < 5)
                .forEach(System.out::println);

        List<Integer> numbersNull = new ArrayList<>();
        numbersNull.add(1);
        numbersNull.add(2);
        numbersNull.add(3);
        numbersNull.add(4);
        numbersNull.add(5);
        numbersNull.add(null);
        numbersNull.add(7);
        numbersNull.add(8);
        numbersNull.add(9);

        System.out.println("Java 8 Stream");
        numbersNull.stream()
                .filter(num -> num != null)
                .map(num -> num * 2)
                .forEach(System.out::println);

        System.out.println("Of Nullable");
        numbersNull.stream()
                .flatMap(num -> Stream.ofNullable(num))
                .map(num -> num * 2)
                .forEach(System.out::println);
    }
}
