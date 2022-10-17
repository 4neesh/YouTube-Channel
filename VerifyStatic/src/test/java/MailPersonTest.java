import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MailEngine.class)
public class MailPersonTest{


    @Test
    public void testSendIsCalled(){
        MailEngine mailEngineMock = mock(MailEngine.class);
        MailPerson mailPerson = new MailPerson(mailEngineMock);

        mailPerson.deliverMail("ABC");
        verify(mailEngineMock).send();
    }

    @Test
    public void testSendMailStaticCalled(){
        PowerMockito.mockStatic(MailEngine.class);
        MailPerson mailPerson = new MailPerson(new MailEngine());
        mailPerson.deliverMail("ABD");

        PowerMockito.verifyStatic(MailEngine.class, Mockito.times(2));
        MailEngine.sendMailToABD();
    }
}