import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MusicianTest {

    @Test
    public void getInstrument(){

        Musician musician1 = mock(Musician.class);
        System.out.println("Musician 1: " + musician1.getScore());

        Musician musician2 = mock(Musician.class, RETURNS_DEFAULTS);
        System.out.println("Musician 2: " + musician2.getScore());

        Musician musician3 = mock(Musician.class, RETURNS_SMART_NULLS);
        System.out.println("Musician 3: " + musician3.getScore());

        Musician musician4 = mock(Musician.class, RETURNS_MOCKS);
        System.out.println("Musician 4: " + musician4.getScore());

        //deep stub allows you to mock a chain of method calls (such as a builder)
        //in one go
        Musician musician5 = mock(Musician.class, RETURNS_DEEP_STUBS);
        System.out.println("Musician 5: " + musician5.getScore());

        //calls real method on the Object as default
        Musician musician6 = mock(Musician.class, CALLS_REAL_METHODS);
        BigDecimal musician6Score = musician6.getScore();
        System.out.println("Musician 6: " + musician6Score.toPlainString());

    }
}
