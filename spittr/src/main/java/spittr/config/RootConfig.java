package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * spittr.config
 *
 * 2017/9/18-19:39
 * 2017
 * Created by wuqiang on 2017/9/18.
 */
@Configuration
@ComponentScan(basePackages = { "spittr" }, excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig {

}
