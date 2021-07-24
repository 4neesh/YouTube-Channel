import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.*;


public class PlayerStatisticsTest {

    private Player playerPatrickUnderThirty;
    private PlayerStatistics statisticsOfPatrickUnderThirty;

    @Before
    public void setup(){

        playerPatrickUnderThirty = new Player("Patrick", 27);
        statisticsOfPatrickUnderThirty = new PlayerStatistics(playerPatrickUnderThirty, 3, 3);

    }

    @Test
    public void playerNameEqual() throws InterruptedException {

        System.out.println("test 1");
        Player player2 = new Player("Parick", 25);
        assertThat(player2).isEqualTo(playerPatrickUnderThirty);
    }

    @Test
    public void playerNamesNotEqual(){
        System.out.println("test 2");
        Player player2 = new Player("Kalvin", 25);
        assertThat(player2).isNotEqualTo(playerPatrickUnderThirty);
    }

    @Test
    public void youngerPlayerSame() {
        System.out.println("test 3");
        Player player2 = new Player("Patrick", 250);
        assertThat(PlayerStatistics.getYoungerPlayer(playerPatrickUnderThirty, player2)).isSameAs(player2);
    }

    @Test
    public void underThirtyTrue(){
        System.out.println("test 4");
        assertThat(statisticsOfPatrickUnderThirty.underThirty()).isTrue();
    }

    @Test
    public void underThirtyFalse(){
        System.out.println("test 5");
        Player player1 = new Player("Patrick", 37);
        PlayerStatistics statistics = new PlayerStatistics(player1, 3, 3);
        assertThat(statistics.underThirty()).isFalse();
    }

    @Test
    public void csvReportNull(){
        System.out.println("test 6");
        PlayerStatistics statistics = new PlayerStatistics(playerPatrickUnderThirty, 0, 0);
        assertThat(statistics.createCsvRecord()).isNull();
    }

    @Test
    public void csvReportNotNull(){
        System.out.println("test 7");
        PlayerStatistics statistics = new PlayerStatistics(playerPatrickUnderThirty, 3, 3);
        assertThat(statistics.createCsvRecord()).isNotNull();
    }

    @Test
    public void getCsvStatsRecord(){
        System.out.println("test 8");
        PlayerStatistics statistics = new PlayerStatistics(playerPatrickUnderThirty, 4, 8);
        Double[] expectedArray = {2d, 0.5};
        assertThat(statistics.createCsvRecord()).isEqualTo(expectedArray);
    }
}
