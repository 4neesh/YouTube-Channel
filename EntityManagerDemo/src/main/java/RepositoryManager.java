import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class RepositoryManager {

	public static final String GET_ALL_STUDENTS = "SELECT * FROM student_table";
	private final EntityManager entityManager;

	public RepositoryManager(EntityManager entityManagerArg){
		entityManager = entityManagerArg;
	}

	public List<Student> getAllStudents(){

		List<Student> studentList = getStudentsQuery(entityManager, GET_ALL_STUDENTS);
		entityManager.close();
		return studentList;
	}

	private static List<Student> getStudentsQuery(EntityManager entityManager, String sql) {
		Query allStudentsQuery = entityManager.createNamedQuery(sql);
		return allStudentsQuery.getResultList();
	}
}
