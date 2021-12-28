import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookingServiceTest {

    @Spy
    BookingRepository bookingRepository;

    @InjectMocks
    BookingService bookingService;

    @Test
    public void testBuyTicket(){

        BookingService bookingServiceSpy = Mockito.spy(bookingService);
        bookingServiceSpy.buyTicket("ABC123");

        Mockito.verify(bookingServiceSpy).bookSeat(any(Ticket.class));
    }


    @Test
    public void testBookSeat(){

        String ticketShowId = "TICKET:ID_1";
        Ticket ticket = new Ticket(ticketShowId);

        List<String> availableTickets = new ArrayList<String>();
        availableTickets.add(ticketShowId);

        when(bookingRepository.getSeats(anyString())).thenReturn(availableTickets);

        assertTrue(bookingService.bookSeat(ticket));
    }
}