import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarShopTest {

    @Test
    public void testCarsInShop(){

        CarShop carShopSpy  = Mockito.spy(CarShop.class);
        Map<String, Integer> carsInStock = new HashMap<String, Integer>();
        carsInStock.put("Jaguar", 10);

        when(carShopSpy.getCarsInStock()).thenReturn(carsInStock);
        doReturn(carsInStock).when(carShopSpy).getCarsInStock();

        assertThat(carShopSpy.getStockForBrand("Jaguar"), is(10));
    }

}
