package cz.upce.fei.nnpia.cv02.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class NewsApp {
    @Autowired
    UserService userService;

    @Autowired
    NotificationService notificationService;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("cz.upce.fei.nnpia.cv02.spring");

        context.getBean(NewsApp.class).process();
    }

    private void process() {
        userService.createUser();
        notificationService.allowNotifications();
    }
}
