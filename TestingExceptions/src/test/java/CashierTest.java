import org.junit.Test;

public class CashierTest {

    @Test(expected = RuntimeException.class)
    public void validateTransactionUnacceptedCurrency(){
        Cashier.validateTransaction("USD", 10);
    }

    @Test(expected = RuntimeException.class)
    public void validateTransactionAmountNegative(){
        Cashier.validateTransaction("EUR", -10);
    }
}
