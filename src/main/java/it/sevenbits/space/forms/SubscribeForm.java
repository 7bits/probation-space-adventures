package it.sevenbits.space.forms;
import org.hibernate.validator.constraints.*;

public class SubscribeForm {
    @Email
    @NotBlank
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
