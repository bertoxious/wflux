package com.ashish.wflux.validations;

import com.ashish.wflux.annotations.PhoneNumber;
import com.ashish.wflux.constants.Constants;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if (!(phoneNumber.isEmpty()) && phoneNumber.matches(Constants.PHONE_NUMBER_REGEX) && phoneNumber.length() <11){
            return true;
        }
        else{
            return false;
        }
    }
}
