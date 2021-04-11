import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class NewsletterSenderTest {

    @Test
    public void constructorAssignsDatabase(){

        MessagingEngine messagingEngine = mock(MessagingEngine.class);
        SubscribersDatabase subscribersDatabase = new SubscribersDatabase();
        NewsletterSender newsletterSender = new NewsletterSender(subscribersDatabase, messagingEngine);

        assertEquals(subscribersDatabase, newsletterSender.getSubscribersDatabase());
    }

    @Test
    public void numberOfSubscribers(){

        SubscribersDatabase subscribersDatabaseMock = mock(SubscribersDatabase.class);
        MessagingEngine messagingEngineMock = mock(MessagingEngine.class);

        NewsletterSender sender = new NewsletterSender(subscribersDatabaseMock, messagingEngineMock);

        List<String> subscribersList = Arrays.asList("email1", "email2", "email3");
        when(subscribersDatabaseMock.getSubscribers()).thenReturn(subscribersList);

        assertEquals(3, sender.numberOfSubscribers());
    }

    @Test(expected = ZeroSubscribersException.class)
    public void zeroSubscribersThrown(){

        NewsletterSender newsletterSender = new NewsletterSender(new SubscribersDatabase(), new MessagingEngine());
        NewsletterSender newsletterSenderSpy = spy(newsletterSender);

        when(newsletterSenderSpy.numberOfSubscribers()).thenReturn(0);

        newsletterSenderSpy.sendNewsletter("SUBJECT");

    }
}
