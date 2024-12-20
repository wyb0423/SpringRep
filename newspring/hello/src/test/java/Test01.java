import com.xs.service.UserService;
import org.junit.Test;

public class Test01 {

    @Test
    public void test(){
        UserService userservice = new UserService();
        userservice.getUser();
    }
}
