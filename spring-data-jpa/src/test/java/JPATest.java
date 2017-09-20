import com.study.domain.User;
import com.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * PACKAGE_NAME
 *
 * 2017/9/20-22:44
 * 2017
 * Created by wuqiang on 2017/9/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/Spring-config.xml")
public class JPATest {

    @Autowired
    private UserService us;

    @Test
    public void testAdd(){
        User u=new User();
        u.setUserName("吴强");
        u.setPassWord("wq123");
        us.addUser(u);
    }

    @Test
    public void find(){
        User userById = us.findUserById(1);
        if(userById!=null){
            System.out.println(userById.getUserName());
        }
    }
}
