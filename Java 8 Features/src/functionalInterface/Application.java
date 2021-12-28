public class Application {

    public static void main(String[] args) {

       Engine rollsRoyceLambda = (base, multiplier) -> {
           Integer multiplierSquared = multiplier * multiplier;
           return multiplierSquared * base;
       };

       System.out.println(rollsRoyceLambda.computePower(1, 2));
    }
}
