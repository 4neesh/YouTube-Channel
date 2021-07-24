import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class BookingManagerTest {

    @Test
    public void addReservationWithMockito(){

        BookingPersister bookingPersisterSpy = spy(BookingPersister.class);
        BookingManager bookingManager = new BookingManager(bookingPersisterSpy);

        ArgumentCaptor<Booking> capturedBooking = ArgumentCaptor.forClass(Booking.class);
        bookingManager.addReservation("Anthony", 2, 19);

        verify(bookingPersisterSpy).persistToDatabase(capturedBooking.capture());
        Booking capturedBookingValue = capturedBooking.getValue();

        assertThat(capturedBookingValue.getTable().getName(), is("Anthony2"));
        assertThat(capturedBookingValue.getTable().getNumber(), is(2));
        assertThat(capturedBookingValue.getTable().getTime(), is(19));

    }

}
