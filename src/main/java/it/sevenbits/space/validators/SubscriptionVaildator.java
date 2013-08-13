package it.sevenbits.space.validators;

import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscriptionForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.util.regex.Pattern;

@Component
public class SubscriptionVaildator implements org.springframework.validation.Validator {

    @Autowired
    private SubscriptionDao subscriptionDao;

    private final static Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-]+(\\." +
            "[_A-Z a-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
            "(\\.[A-Za-z]{2,})$");

    @Override
    public boolean supports(final Class<?> aClass) {
        return aClass.isAssignableFrom(SubscriptionForm.class);
    }

    @Override
    public void validate(final Object obj, final Errors errors) {



        SubscriptionForm subscriptionForm = (SubscriptionForm) obj;
        String email = subscriptionForm.getEmail();
        validateEmail(email, errors);
    }

    private void validateEmail(final String email, final Errors errors) {

        if (!correctEmail(email)) {
            errors.rejectValue("email", "email.invalid", "Некорректный email");
        }
        if (existEmail(email)) {
            errors.rejectValue("email", "email.required", "Такой email уже существут");
        }
    }

    private boolean existEmail(final String email) {
        return (!subscriptionDao.exist(email));
    }

    private boolean correctEmail(final String value) {
        return EMAIL_PATTERN.matcher(value).matches();
    }

}
