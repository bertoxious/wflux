package com.ashish.wflux.annotations;

import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)

public @interface Name {
    String message() default "Name should be less than 50 characters";
    Class <?>[] groups() default {};
    Class <? extends Payload>[] payload() default {};
}
