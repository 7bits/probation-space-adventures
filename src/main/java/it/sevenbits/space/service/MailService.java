package it.sevenbits.space.service;

import it.sevenbits.space.domain.User;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private MailSender mailSender;
    private SimpleMailMessage templateMessage;

    public void setMailSender(MailSender mailSender) {

        this.mailSender = mailSender;
    }

    public void setTemplateMessage(SimpleMailMessage templateMessage) {
        this.templateMessage = templateMessage;
    }

    public void sendConfirmationEmail(final User user) {

        SimpleMailMessage msg = new SimpleMailMessage(templateMessage);

        msg.setText("Hello, "
                + user.getUsername()
                + ".\nPlease, confirm your registration on Space Adventures: "
                + user.getActivationCode()
        );
        mailSender.send(msg);
    }
}
