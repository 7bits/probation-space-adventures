package it.sevenbits.space.web.validator;

import it.sevenbits.space.dao.ISubscriptionDao;
import it.sevenbits.space.web.form.SubscriptionForm;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * validation of email from org.apache.commons.validator.routines.EmailValidator library
 */
@Component
public class SubscriptionVaildator implements org.springframework.validation.Validator {

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
     * <p> Проверка формы на валидность  </p>
     * @param email Электронный адресс
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


    private boolean isUnique(final String email) {
        return !ISubscriptionDao.exists(email);
    }


}
