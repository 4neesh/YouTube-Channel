public interface Person {

    void doSport();
    void eatFood();
    void doHobbies();
    void visitShops();
    void doJob();

    default void getDailyActivities(){

        getNormalActivities();
        this.doJob();
    }

    default void getWeekendActivities(){

        getNormalActivities();
        this.doHobbies();
        this.visitShops();

    }

    private void getNormalActivities(){
        this.doSport();
        this.eatFood();
    }
}
