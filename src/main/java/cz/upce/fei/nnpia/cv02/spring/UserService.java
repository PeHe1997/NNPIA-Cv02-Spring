package cz.upce.fei.nnpia.cv02.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    EmailService emailService;

    public void createUser() {
        System.out.println("User account created");
        emailService.sendEmail("st55190@upce.cz", "Your account was created");
    }
}
