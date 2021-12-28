public class ChessPlayer {

    private String name;
    private String category;
    private Integer age;

    private Integer wins;
    private Integer points;

    public ChessPlayer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void assignCategory() throws Exception{
        System.out.println("Assigning category for " + this.name);

        if(this.getAge() < 5){
            throw new Exception("Player age too low");
        }
        this.category = this.getAge() < 18 ? "Under 18's" : "Senior";
    }

    public void assignScoreStats(){
        System.out.println("Assigning score stats for " + this.name);

        //connects to database
        //calculates wins and sets value
        this.wins = 3;
        //calculates total points and sets to 'points'
        this.points = 9;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPoints() {
        return points;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public Integer getWins() {
        return this.wins;
    }
}
