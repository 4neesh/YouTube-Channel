import lombok.Builder;

@Builder
public class FootballPlayer {

    private String name;
    private Integer age;
    private Integer goals;
    private Integer games;
    private String team;
    private String league;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGoals() {
        return goals;
    }

    public Integer getGames() {
        return games;
    }

    public String getTeam() {
        return team;
    }

    public String getLeague() {
        return league;
    }
}
