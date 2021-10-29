package com.brq.cadastroCliente.annotations;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.brq.cadastroCliente.constants.ApiConstants;



public class EmailValidatorDomain implements ConstraintValidator<EmailValidator, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return  (null == value || value.trim().isEmpty()) ? false : Pattern.matches(ApiConstants.EMAIL_REGEX, value);
    }
}
