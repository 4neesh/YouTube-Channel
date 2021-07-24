import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Player player1 = new Player("Jordan", 27);
        Player player2 = new Player("Kyle", 31);
        Player player3 = new Player("John", 27);
        Player player4 = new Player("Tyrone", 28);
        Player player5 = new Player("Kieran", 30);
        Player player6 = new Player("Kalvin", 25);
        Player player7 = new Player("Declan", 22);
        Player player8 = new Player("Mason", 22);
        Player player9 = new Player("Phillip", 21);
        Player player10 = new Player("Harry", 27);
        Player player11 = new Player("Raheem", 26);

        List<Player> squad = Arrays.asList(player1, player2, player3,
                player4, player5, player6, player7, player8, player9,
                player10, player11);


        int accumulativeAgeOfSquad = calculatePlayerListTotalAge(squad);
        int squadSize = squad.size();
        double averageAge = divideTwoNumbers(accumulativeAgeOfSquad, squadSize);
        System.out.println(averageAge);
    }

    private static double divideTwoNumbers(int numerator, int denominator) {
        return numerator/denominator;
    }

    private static int calculatePlayerListTotalAge(List<Player> squad) {
        System.out.println("Calculating total player age for squad of size: " + squad);
        return squad.stream().mapToInt(player -> player.getAge()).sum();
    }
}
