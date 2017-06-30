package weddinginvitation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "weddinginvitation")
@EnableAutoConfiguration
@MapperScan("weddinginvitation.dao")
public class AppStarter {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(AppStarter.class, args); 
    }
}



