import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TrainBarriersTest {

    @Mock
    EmailService emailServiceMock;
    final int PASSENGER_ID = 3;

    @Test
    public void passengerEntry(){

        //given - setup for test
        TrainBarriers trainBarriers = new TrainBarriers(emailServiceMock);
        TrainBarriers trainBarriersSpy = spy(trainBarriers);
        when(trainBarriersSpy.passengerIsEligible(PASSENGER_ID)).thenReturn(true);

        //when - method invocation
        trainBarriersSpy.passengerEntry(PASSENGER_ID);

        //then - what we expect
        verify(emailServiceMock).notifyPassenger(PASSENGER_ID);
        assertTrue(trainBarriersSpy.getPassengersOnBoard().contains(PASSENGER_ID));
    }

    @Test
    public void passengerEntryBDD(){

        //given - setup for test
        TrainBarriers trainBarriers = new TrainBarriers(emailServiceMock);
        TrainBarriers trainBarriersSpy = spy(trainBarriers);
        given(trainBarriersSpy.passengerIsEligible(PASSENGER_ID))
                .willReturn(true);

        //when - method invocation
        trainBarriersSpy.passengerEntry(PASSENGER_ID);

        //then - what we expect
        then(emailServiceMock)
                .should()
                .notifyPassenger(PASSENGER_ID);

        assertTrue(trainBarriersSpy.getPassengersOnBoard().contains(PASSENGER_ID));
    }
}
