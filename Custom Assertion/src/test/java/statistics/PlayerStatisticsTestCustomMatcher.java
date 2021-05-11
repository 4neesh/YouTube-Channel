package statistics;

import org.junit.Test;

import static statistics.PlayerAssert.assertThat;

public class PlayerStatisticsTestCustomMatcher {

    @Test
    public void playerConstructorAssignsName(){

        Player player = new Player("Stuart", 30);
        assertThat(player).hasName("Stuart1");
    }
}
