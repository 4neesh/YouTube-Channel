import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        Map<String, List<Player>> teamPlayerMap = fetchTeamPlayerMap();
        Map<String, Integer> teamAverageAgeMap = calculateAverageTeamAge(teamPlayerMap);
        printPlayersToReport(teamPlayerMap, teamAverageAgeMap);
    }

    private static Map<String, List<Player>> fetchTeamPlayerMap() {

        List<Player> players = new ArrayList<>();
        players.add(new Player("Jordan", "A United",27));
        players.add(new Player("Kyle", "B United",31));
        players.add(new Player("John", "A United",27));
        players.add(new Player("Tyrone", "A City",28));
        players.add(new Player("Kieran", "A City",30));
        players.add(new Player("Kalvin", "B United",25));
        players.add(new Player("Declan", "A United",22));
        players.add(new Player("Mason", "A City",22));
        players.add(new Player("Phillip", "A City",21));
        players.add(new Player("Harry", "C United",27));
        players.add(new Player("Raheem", "A City",26));

        players.add(new Player("Kyle", "D United",31));
        players.add(new Player("John", "AC United",27));
        players.add(new Player("Tyrone", "E City",28));
        players.add(new Player("Kieran", "F City",30));
        players.add(new Player("Kalvin", "G United",25));
        players.add(new Player("Declan", "H United",22));
        players.add(new Player("Mason", "AI City",22));
        players.add(new Player("Phillip", "AI City",21));
        players.add(new Player("Harry", "CA United",27));
        players.add(new Player("Raheem", "AS City",26));
        return players.stream()
                .collect(Collectors.groupingBy(entry -> entry.getTeam()));
    }


    private static Map<String, Integer> calculateAverageTeamAge(Map<String, List<Player>> teamPlayerMap) {

        Map<String, Integer> teamToAverageAgeMap = new HashMap<>();

        for(String team : teamPlayerMap.keySet()){

            List<Player> teamPlayers = teamPlayerMap.get(team);
            teamToAverageAgeMap.put(team, 0);
            Integer totalAge = 0;
            for(Player player : teamPlayers){
                totalAge += player.getAge();
            }
            Integer averageAge = totalAge / teamPlayers.size();
            teamToAverageAgeMap.put(team, averageAge);
        }

        return teamToAverageAgeMap;
     }


    private static void printPlayersToReport(Map<String, List<Player>> aUnitedPLayers, Map<String, Integer> teamAverageAgeMap) {
    }
}
