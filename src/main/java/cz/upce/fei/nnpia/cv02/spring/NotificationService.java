package cz.upce.fei.nnpia.cv02.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    EmailService emailService;

    public void allowNotifications() {
        System.out.println("Account allowed notification");
        emailService.sendEmail("st55190@upce.cz", "Your account allowed notifications");
    }
}
