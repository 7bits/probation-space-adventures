package it.sevenbits.space.forms;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class SubscribeForm {
    @Email (message = "Введите корректный email")
    @NotBlank (message = "Необходимо ввести email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}
