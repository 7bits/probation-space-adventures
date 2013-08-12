package it.sevenbits.space.validators;

import it.sevenbits.space.dao.SubscriptionDao;
import it.sevenbits.space.forms.SubscribeForm;
import org.hibernate.validator.internal.constraintvalidators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import java.util.regex.Pattern;


@Component
public class SubscribeVaildator implements org.springframework.validation.Validator {


    @Autowired
    @Qualifier("subscriptionDao")
    private SubscriptionDao subscriptionDao;

    EmailValidator emailValidator = new EmailValidator();

    private final static Pattern EMAIL_PATTERN = Pattern.compile(".+@.+\\.[a-z]+");

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.isAssignableFrom(SubscribeForm.class);
    }

    @Override
    public void validate(Object obj, Errors errors) {



        SubscribeForm subscribeForm = (SubscribeForm) obj;
        String email = subscribeForm.getEmail();
        validateEmail(email, errors);
    }

    private void validateEmail(String email, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required");
        //ValidationUtils.rejectIfEmpty(errors, "email", "email.empty");
        /*emailValidator.initialize(email);
        if(!emailValidator.isValid(email)){

        } */
        /*if (!isValidString(email)) {
            errors.rejectValue("email", "email.empty","Email is empty");
        }  */
        if (!isEmail(email)) {
            errors.rejectValue("email", "email.invalid", "Email is invalid");
        }
        if (!isUnExsist(email)) {
            errors.rejectValue("email", "email.required","Email already exist");
        }
    }

    private boolean isValidString(String str) {

        return isNotNull(str) && (str.length() > 0);
    }

    private boolean isNotNull(String str) {

        return str != null;
    }

    private boolean isUnExsist(String email){

        return subscriptionDao.isInBase(email);
    }

    private boolean isEmail(String value) {

        return EMAIL_PATTERN.matcher(value).matches();
    }

}
