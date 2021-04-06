import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingManagerTest {

    private HotelDao hotelDaoMock;
    private BookingManager bookingManager;

    @Before
    public void setup() throws SQLException {

        hotelDaoMock = mock(HotelDao.class);
        bookingManager = new BookingManager(hotelDaoMock);

        List<String> availableRooms = Arrays.asList("A");
        when(hotelDaoMock.fetchAvailableRooms()).thenReturn(availableRooms);

    }

    @Test
    public void checkAvailableRoomsTrue() throws SQLException {
        assertTrue(bookingManager.checkRoomAvailability("A"));
    }

    @Test
    public void checkAvailableRoomsFalse() throws SQLException {
        assertFalse(bookingManager.checkRoomAvailability("B"));
    }
}
