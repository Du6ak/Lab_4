package Lab_4.runner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Lab_4.config.ApplicationConfig;
import Lab_4.service.GroupService;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        GroupService groupService = ctx.getBean(GroupService.class);
        System.out.println(groupService.readByName("IT-4"));
        ctx.close();
    }

}
