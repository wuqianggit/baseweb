import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spittr.config.DataSourceConfiguration;
import spittr.domain.Spitter;
import spittr.persistence.SpitterRepository;

import javax.sql.DataSource;

/**
 *
 * PACKAGE_NAME
 *
 * 2017/9/19-21:17
 * 2017
 * Created by wuqiang on 2017/9/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourceConfiguration.class)
public class RepositoryTest {

/*    @Autowired
    private SpitterRepository repository;*/

    @Autowired
    private DataSource dataSource;

    @Test
    public void add(){
        Spitter sp=new Spitter();
        sp.setUsername("hhh");
        sp.setPassword("123");

        //repository.addSpitter(sp);
    }

    @Test
    public void dataSource(){
        if(dataSource!=null){
            System.out.println("yes yes");
        }else{
            System.out.println("nonono");
        }
    }
}
