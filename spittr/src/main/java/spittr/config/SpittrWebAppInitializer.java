package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spittr.config.RootConfig;
import spittr.config.WebConfig;

/**
 *
 * spittr.config
 *
 * 用来代替Web.xml配置Servlet
 * Web容器需要支持Servlet3.0（Tomcat7.0及以上）
 * 2017/9/18-19:32
 * 2017
 * Created by wuqiang on 2017/9/18.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    /**
     * 将 DispatcherServlet映射到“/”
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 返回带有 @Configuration注解的类，配置ContextLoaderListener创建的应用上下文的Bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses 启动了！");
        return new Class[]{RootConfig.class};
    }
    /**
     * 返回带有@Configuration注解的类，来定义 DispatcherServlet应用上下文Bean
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses 启动了！");
        return new Class[]{WebConfig.class};
    }

}
