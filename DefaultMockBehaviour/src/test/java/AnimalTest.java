import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Mock(answer= Answers.RETURNS_DEFAULTS)
    Animal animal;

    @Test
    public void testAnimal(){

        System.out.println("---Returns Defaults---");
        Animal lion = mock(Animal.class);
        System.out.println(lion.getZooKeeper());
        System.out.println(lion.age);

        Animal lion2 = mock(Animal.class, RETURNS_DEFAULTS);
        System.out.println(lion2.getZooKeeper());
        System.out.println(lion2.age);

        ZooKeeper zooKeeperJohn = new ZooKeeper("John");
        System.out.println("---Returns Smart Nulls---");
        Animal lion3 = mock(Animal.class, RETURNS_SMART_NULLS);
        when(lion3.getZooKeeper()).thenReturn(zooKeeperJohn);
        System.out.println(lion3.getZooKeeper());

        System.out.println("---Returns Mock---");
        Animal lion4 = mock(Animal.class, RETURNS_MOCKS);
        System.out.println(lion4.age);
        System.out.println(lion4.getZooKeeper());
        when(lion4.getZooKeeper()).thenReturn(mock(ZooKeeper.class));
        System.out.println("Name: " + lion4.getZooKeeper().getName());

        System.out.println("---Returns Deep Stubs---");
        Animal lion5 = mock(Animal.class, RETURNS_DEEP_STUBS);
        when(lion5.getZooKeeper().getName()).thenReturn("Alan");
        System.out.println(lion5.getZooKeeper().getName());
    }
}
