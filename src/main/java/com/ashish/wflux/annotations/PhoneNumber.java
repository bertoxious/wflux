package com.ashish.wflux.annotations;

import com.ashish.wflux.validations.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = PhoneNumberValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumber {
    String message() default "Invalid Phone Number";
    Class <?>[] groups() default {};
    Class <? extends Payload>[] payload() default {};

}
