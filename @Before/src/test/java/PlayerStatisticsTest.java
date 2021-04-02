import org.junit.Before;
import org.junit.Test;

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
    public void playerNameEqual(){
        System.out.println("test 1");
        Player player2 = new Player("Patrick", 25);
        assertEquals(playerPatrickUnderThirty, player2);
    }

    @Test
    public void playerNamesNotEqual(){
        System.out.println("test 2");
        Player player2 = new Player("Kalvin", 25);
        assertNotEquals(playerPatrickUnderThirty, player2);
    }

    @Test
    public void youngerPlayerSame(){
        System.out.println("test 3");
        Player player2 = new Player("Patrick", 25);
        assertSame(player2, PlayerStatistics.getYoungerPlayer(playerPatrickUnderThirty, player2));
    }

    @Test
    public void underThirtyTrue(){
        System.out.println("test 4");
        assertTrue(statisticsOfPatrickUnderThirty.underThirty());
    }

    @Test
    public void underThirtyFalse(){
        System.out.println("test 5");
        Player player1 = new Player("Patrick", 37);
        PlayerStatistics statistics = new PlayerStatistics(player1, 3, 3);
        assertFalse(statistics.underThirty());
    }

    @Test
    public void csvReportNull(){
        System.out.println("test 6");
        PlayerStatistics statistics = new PlayerStatistics(playerPatrickUnderThirty, 0, 0);
        assertNull(statistics.createCsvRecord());
    }

    @Test
    public void csvReportNotNull(){
        System.out.println("test 7");
        PlayerStatistics statistics = new PlayerStatistics(playerPatrickUnderThirty, 3, 3);
        assertNotNull(statistics.createCsvRecord());
    }

    @Test
    public void getCsvStatsRecord(){
        System.out.println("test 8");
        PlayerStatistics statistics = new PlayerStatistics(playerPatrickUnderThirty, 4, 8);
        Double[] expectedArray = {2d, 0.5};
        assertArrayEquals(expectedArray, statistics.createCsvRecord());
    }
}
