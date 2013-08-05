package it.sevenbits.space.forms;
import org.hibernate.validator.constraints.Email;

public class SubscribeForm {
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
