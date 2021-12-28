package optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class App {

    public static void main(String[] args) {

//        Optional<Integer> opInteger = Optional.of(10);
//        OptionalDouble opDouble = OptionalDouble.of(2d);
//        OptionalInt opInt = OptionalInt.of(5);
//
//        System.out.println(opInteger);
//        System.out.println(opDouble);
//        System.out.println(opInt);
//
//        Optional<String> opString = Optional.empty();
//        System.out.println(opString);
//
//        Optional<Integer> optionalNull1 = Optional.ofNullable(null);
//        Optional<Integer> optionalNull2 = Optional.ofNullable(10);
//        System.out.println(optionalNull1);
//
//        System.out.println("Optional 1 is present: " + optionalNull1.isPresent());
//        System.out.println("Optional 2 is present: " + optionalNull2.isPresent());
//
//        System.out.println("Optional 2 .get(): " + optionalNull2.get());
//        optionalNull1.get();

        String name = getName().orElse(getBamford());
        String name2 = getName().orElseGet(() -> {
            System.out.println("Getting Phillips");
            return "Phillips";
        });
        System.out.println(name);
        System.out.println(name2);
    }

    private static String getBamford() {
        System.out.println("Getting Bamford");
        return "Bamford";
    }

    private static Optional<String> getName() {
        return Optional.of("Rodrigo");
    }
}
