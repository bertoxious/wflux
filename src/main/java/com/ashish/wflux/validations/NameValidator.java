package com.ashish.wflux.validations;

import com.ashish.wflux.annotations.Name;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<Name, String> {
    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        if(!(name.length()<50)){
            return true;
        }
        else{
            return false;
        }
    }
}
