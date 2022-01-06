package service.utility;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceUtil {

    public static List<String> filterItems(List<String> items){

        return items.stream()
                .map(String::toUpperCase)
                .filter(item -> item.length() < 1)
                .collect(Collectors.toList());
    }
}
