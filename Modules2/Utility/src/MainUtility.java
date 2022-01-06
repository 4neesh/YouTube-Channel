import com.services.MyRandomService;
import com.services.RandomService;

public class MainUtility {

    public static void main(String[] args) {

        RandomService a  = new MyRandomService();
        a.speak();
    }

}
