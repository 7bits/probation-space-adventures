package it.sevenbits.space.validators;

import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscribeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import java.util.regex.Pattern;

@Component
public class SubscribeVaildator implements org.springframework.validation.Validator {

    @Autowired
    @Qualifier("subscriptionDao")
    private SubscriptionDao subscriptionDao;

    private final static Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-]+(\\." +
            "[_A-Z a-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
            "(\\.[A-Za-z]{2,})$");

    @Override
    public boolean supports(final Class<?> aClass) {
        return aClass.isAssignableFrom(SubscribeForm.class);
    }

    @Override
    public void validate(final Object obj, final Errors errors) {



        SubscribeForm subscribeForm = (SubscribeForm) obj;
        String email = subscribeForm.getEmail();
        validateEmail(email, errors);
    }

    private void validateEmail(final String email, final Errors errors) {

        if (!isEmail(email)) {
            errors.rejectValue("email", "email.invalid", "Email is invalid");
        }
        if (!isUnExsist(email)) {
            errors.rejectValue("email", "email.required", "Email already exist");
        }
    }

    private boolean isUnExsist(final String email) {

        return subscriptionDao.isInBase(email);
    }

    private boolean isEmail(final String value) {

        return EMAIL_PATTERN.matcher(value).matches();
    }

}
