import java.util.List;

public class CustomerOrder {

    private BreakfastWaiter breakfastWaiter;
    private DinnerWaiter dinnerWaiter;

    public void setBreakfastWaiter(BreakfastWaiter breakfastWaiter) {
        this.breakfastWaiter = breakfastWaiter;
    }

    public void setDinnerWaiter(DinnerWaiter dinnerWaiter) {
        this.dinnerWaiter = dinnerWaiter;
    }

    public List<String> vegetarianBreakfast() {
        return breakfastWaiter.getVegetarianMenu();
    }

    public List<String> meatBreakfast() {
        return breakfastWaiter.getMeatMenu();
    }

    public List<String> vegetarianDinner() {
        return dinnerWaiter.getVegetarianMenu();
    }

    public List<String> meatDinner() {
        return dinnerWaiter.getMeatMenu();
    }
}
