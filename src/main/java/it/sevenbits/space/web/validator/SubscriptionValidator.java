package it.sevenbits.space.web.validator;

import it.sevenbits.space.dao.ISubscriptionDao;
import it.sevenbits.space.web.form.SubscriptionForm;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * Validation of email from org.apache.commons.validator.routines.EmailValidator library
 */
@Component
public class SubscriptionValidator implements org.springframework.validation.Validator {

    @Autowired
    private ISubscriptionDao ISubscriptionDao;

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

    /**
     * Checks subscription information.
     * @param email subscriber email.
     * @param errors
     */
    private void validateEmail(final String email, final Errors errors) {

        boolean isValidEmail = EmailValidator.getInstance().isValid(email);

        if (!isValidEmail) {
            errors.rejectValue("email", "email.invalid", "Некорректный email");
        }
        if (!isUnique(email)) {
            errors.rejectValue("email", "email.required", "Такой email уже существует");
        }
    }

    /**
     * Checks if the email is not already exist in database.
     * @param email email to check.
     * @return true if it is new email, false else.
     */
    private boolean isUnique(final String email) {
        return !ISubscriptionDao.exists(email);
    }


}
