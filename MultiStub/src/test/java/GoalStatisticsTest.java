import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GoalStatisticsTest {

    @Mock
    GoalsService goalsService;

    @InjectMocks
    GoalStatistics goalStatistics;

    @Test
    public void testGoalsPerGame() throws Exception {

        String playerName = "Player";

        when(goalsService.getGoals(playerName)).thenReturn(100).thenReturn(10);
        Integer goalsHigh = goalStatistics.goalsPerGame(playerName, 10);
        assertThat(goalsHigh, is(10));

        Integer goalsLow = goalStatistics.goalsPerGame(playerName, 10);
        assertThat(goalsLow, is(1));

        System.out.println(goalStatistics.goalsPerGame(playerName, 10));
        System.out.println(goalStatistics.goalsPerGame(playerName, 10));
        System.out.println(goalStatistics.goalsPerGame(playerName, 10));
    }

}