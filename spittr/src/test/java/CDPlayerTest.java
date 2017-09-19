import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayer;
import soundsystem.CDPlayerConfig;
import spittr.config.DataSourceConfiguration;

import javax.sql.DataSource;

/**
 *
 * com.wq.spring.soundsystem
 *
 * 测试类
 * 2017/9/17-16:35
 * 2017
 * Created by wuqiang on 2017/9/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerTest {

    @Autowired
    private CDPlayer player;

    @Test
    public void testCdPlayer(){
        player.play();
    }

}
