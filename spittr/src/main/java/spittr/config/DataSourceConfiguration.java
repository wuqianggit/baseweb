package spittr.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

/**
 *
 * spittr.config
 *
 * 数据源配置
 * 2017/9/19-20:41
 * 2017
 * Created by wuqiang on 2017/9/19.
 */
@Configuration
@ComponentScan(basePackages = {"spittr"})
public class DataSourceConfiguration {
    /**
     * 配置数据源
     * @return
     */
    @Bean(name = "dataSource") public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    /**
     * hibernate JPA实现
     * @return
     */
    @Bean public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        return adapter;
    }

    /**
     * 配置 容器管理类型的JPA
     * @param dataSource 数据源
     * @param jpaVendorAdapter 使用哪个厂商的JPA实现
     * @return
     */
    @Bean public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource,
            JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter);
        emfb.setPackagesToScan("spittr.domain");//设置 自动扫描的包名，查找带有@Entity注解的类
        return emfb;
    }

}
