package my;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class Config {

    @Value("${dao.impl.number}")
    private String implementation;

    @Bean
    public MessageDao messageDao() {
        if (Integer.parseInt(implementation) == 1) {
            return new MessageDaoImpl1();
        } else {
            return new MessageDaoImpl2();
        }
    }

    @Bean
    public MessageService messageService(MessageDao messageDao) {
        return new MessageService(messageDao);
    }
}
