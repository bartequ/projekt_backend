package pl.edu.agh.kt.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<ValidatePassword, String> {
    private static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

    @Override
    public void initialize(ValidatePassword constraintAnnotation) {
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}
