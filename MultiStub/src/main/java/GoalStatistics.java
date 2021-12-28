public class GoalStatistics {

    private GoalsService goalsService;

    public GoalStatistics(GoalsService goalsService) {
        this.goalsService = goalsService;
    }

    public Integer goalsPerGame(String player, Integer games) throws Exception {

        Integer goals = goalsService.getGoals(player);
        if(goals <= 0){
            throw new Exception("No Goals Scored");
        }
        return goals / games;
    }
}

class GoalsService{

    public Integer getGoals(String player){
        return (int)Math.floor(Math.random() * (10) + 1);
    }
}