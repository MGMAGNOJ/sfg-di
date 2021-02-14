package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.examplebeans.FakeDatasourse;




@Configuration

// Configura arquivos de DataSource para parametros.
@PropertySources({
    @PropertySource("classpath:datasource.properties"),
    @PropertySource("classpath:datasource2.properties")
})
    

public class PropertyConfig {


    // Busta um objeto do ambiente SO
    @Autowired
    Environment env;

    @Value("${dt1.username}")
    String dt1Username;

    @Value("${dt1.password}")
    String dt1Password;

    @Value("${dt1.url}")
    String dt1Url;

    @Value("${dt2.username}")
    String dt2Username;

    @Value("${dt2.password}")
    String dt2Password;

    @Value("${dt2.url}")
    String dt2Url;

    

    @Bean
    public FakeDatasourse fakeDatasourse(){
        FakeDatasourse fakeDatasourse = new FakeDatasourse();
        //fakeDatasourse.setUsername(username);
        
        fakeDatasourse.setSoUsername(env.getProperty("USERNAME"));

        fakeDatasourse.setDt1Username(dt1Username);
        fakeDatasourse.setDt1Password(dt1Password);
        fakeDatasourse.setDt1Url(dt1Url);

        fakeDatasourse.setDt2Username(dt2Username);
        fakeDatasourse.setDt2Password(dt2Password);
        fakeDatasourse.setDt2Url(dt2Url);

        return fakeDatasourse;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
            return propertySourcesPlaceholderConfigurer;

    }
    
}
