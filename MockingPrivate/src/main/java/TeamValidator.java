public class TeamValidator {

    private Integer maxTeamLevel = 100;

    public boolean createTeam(Player player1, Player player2){

        //validates players (exp < age)

        //checks db that players are not in a team (and throws exception)

        //notifies organisers of request to create team

        return calculateTeamLevel(player1, player2) < maxTeamLevel;
    }

    private Integer calculateTeamLevel(Player player1, Player player2){
        return (player1.getAge() * player1.getExperience())
                + player2.getAge() + player2.getExperience();
    }
}
