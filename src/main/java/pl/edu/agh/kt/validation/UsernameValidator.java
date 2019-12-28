package pl.edu.agh.kt.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<ValidateUsername, String> {

    //TODO Optionally add password and email validator and extend this one
    @Override
    public void initialize(ValidateUsername constraintAnnotation) {
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return username.length() > 6;
    }
}
