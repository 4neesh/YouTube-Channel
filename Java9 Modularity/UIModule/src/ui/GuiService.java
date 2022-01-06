package ui;

import service.process.ShopService;

import java.util.List;

public class GuiService {

    private ShopService shopService;

    public GuiService(ShopService shopService) {
        this.shopService = shopService;
    }

    //get mapping
    public List<String> getLatestItems(){

        return this.shopService.getAllShopItems();
    }
}
