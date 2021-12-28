import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryManagerTest {


    @Test
    public void getAllStudentsTest(){

        EntityManager emMock = Mockito.mock(EntityManager.class);

        RepositoryManager repositoryManager = new RepositoryManager(emMock);

        Student a = new Student(1, "Parker");
        Student b = new Student(2, "Mary");
        Student c = new Student(3, "Ben");
        List<Student> studentList = Arrays.asList(a,b,c);

        Query queryMock = Mockito.mock(Query.class);
        when(queryMock.getResultList()).thenReturn(studentList);

        when(emMock.createNamedQuery(RepositoryManager.GET_ALL_STUDENTS)).thenReturn(queryMock);

        List<Student> actualStudents = repositoryManager.getAllStudents();
        assertThat(actualStudents, is(studentList));
    }

}
