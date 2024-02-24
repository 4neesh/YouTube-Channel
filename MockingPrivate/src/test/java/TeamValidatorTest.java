import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;


@PrepareForTest(TeamValidator.class)
@RunWith(PowerMockRunner.class)
public class TeamValidatorTest {

    @Mock
    TeamValidator teamValidatorMock;

    @Test
    public void teamWithHighLevel_cannotBeCreated(){

        Player playerA = new Player(30, 5);
        Player playerB = new Player(23, 4);

        doReturn(false).when(teamValidatorMock, "calculateTeamLevel", ArgumentMatchers.any());


                //mock the private method to return

    }
}