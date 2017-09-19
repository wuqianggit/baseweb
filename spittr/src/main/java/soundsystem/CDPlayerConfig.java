package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 配置类 不应该有任何业务逻辑
 * com.wq.spring.soundsystem
 * CDPlayer的配置类，开启自动扫描
 *
 * 2017/9/17-16:36
 * 2017
 * Created by wuqiang on 2017/9/17.
 */
@Configuration
//@ComponentScan(basePackages = "com.wq.spring.soundsystem")//设置默认扫描的包 注释掉了自动扫描 @Componet注解就不起作用了
public class CDPlayerConfig {
    //声明简单的bean
    @Bean(name = "lonely") //随便起个名字
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    //注入
    @Bean(name = "cdplayerA") public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}
