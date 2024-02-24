import java.util.List;
import java.util.Map;

public class Main {

public void addItemToShoppingMap(List<String> shoppingList,
                     Map<String, Integer> itemsToQuantity,
                     String item){

    for(String listItem: shoppingList){

        if(listItem.equals(item)){
            itemsToQuantity.put(listItem, 1);
        }

    }

}
}
