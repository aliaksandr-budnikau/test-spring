package my;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Controller bean = applicationContext.getBean(Controller.class);
        System.out.println(bean.getService().getById(1).getText());
    }
}
