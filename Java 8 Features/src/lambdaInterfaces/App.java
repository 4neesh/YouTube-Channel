package lambdaInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        numberList.stream()
                .map(num -> num * 2)
                .filter(num -> num < 5)
                .forEach(num -> System.out.println(num));

        Supplier<Integer> intSupplier = () -> 4;

        System.out.println(intSupplier.get());

    }
}
