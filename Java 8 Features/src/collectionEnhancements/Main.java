package collectionEnhancements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Integer> goalsList = Arrays.asList(5,7,10,2);

        Map<String, Integer> playerToGoalsMap = new HashMap<>();
        playerToGoalsMap.put("Andy", 5);
        playerToGoalsMap.put("Michael", 7);
        playerToGoalsMap.put("Jan", 10);
        playerToGoalsMap.put("Dwight", 2);

        Integer goalsByJim = 0;
        if(playerToGoalsMap.containsKey("Jim")){
            goalsByJim = playerToGoalsMap.get("Jim");
        }

        Integer goalsByJim2 = playerToGoalsMap.getOrDefault("Jim", 100);

//        if(!playerToGoalsMap.containsKey("Jim")){
//            playerToGoalsMap.put("Jim", 5);
//        }
        playerToGoalsMap.putIfAbsent("Jim", 5);
//        System.out.println(playerToGoalsMap.get("Jim"));

//        if(playerToGoalsMap.containsKey("Jim")){
//            if(playerToGoalsMap.get("Jim").equals(5)){
//                playerToGoalsMap.put("Jim", 7);
//            }
//        }


        playerToGoalsMap.replace("Jim", 6, 7);
//        System.out.println(playerToGoalsMap.get("Jim"));

//        for(String name: playerToGoalsMap.keySet()){
//            playerToGoalsMap.put(name, 0);
//        }
//        playerToGoalsMap.replaceAll((key, value) -> value * 2);
//        System.out.println(playerToGoalsMap);

//        if(playerToGoalsMap.containsKey("Jan")){
//            Integer goalsForJan = playerToGoalsMap.get("Jan");
//            playerToGoalsMap.put("Jan", goalsForJan * 3);
//        }
        playerToGoalsMap.put("Jan", null);
//        playerToGoalsMap.compute("Jan", (key, value) -> value * 3);
        playerToGoalsMap.merge("Jan", 11, (key, value) -> value * 3);
        System.out.println(playerToGoalsMap.get("Jan"));

    }
}
