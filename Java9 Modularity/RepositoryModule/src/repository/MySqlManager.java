package repository;

import java.util.Arrays;
import java.util.List;

public class MySqlManager {

    public List<String> getShopItems() {

        //connects to database
        return Arrays.asList("Apple", "Snickers", "Banana");
    }
}
