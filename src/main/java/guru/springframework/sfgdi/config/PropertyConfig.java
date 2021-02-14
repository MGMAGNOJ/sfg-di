package guru.springframework.sfgdi.config;

import javax.print.FlavorException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.examplebeans.FakeDatasourse;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @Value("${url}")
    String url;

    @Bean
    public FakeDatasourse fakeDatasourse(){
        FakeDatasourse fakeDatasourse = new FakeDatasourse();
        fakeDatasourse.setUsername(username);
        fakeDatasourse.setPassword(password);
        fakeDatasourse.setUrl(url);
        return fakeDatasourse;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
            return propertySourcesPlaceholderConfigurer;

    }
    
}
