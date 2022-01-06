package service.process;

import repository.MySqlManager;
import service.utility.ServiceUtil;

import java.util.List;

public class ShopService {

    private MySqlManager mySqlManager;

    public ShopService(MySqlManager sqlManager){
        this.mySqlManager = sqlManager;
    }

    public List<String> getAllShopItems(){
        //validate request

        List<String> items = this.mySqlManager.getShopItems();

        //transform request
        return ServiceUtil.filterItems(items);
    }
}
