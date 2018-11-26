package com.dolphinsmemory.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.validation.Constraint;
import javax.validation.Payload;


import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Target;



import com.dolphinsmemory.validatorImpl.PasswordRulesValidator;

@Documented
@Constraint(validatedBy = PasswordRulesValidator.class)
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface ValidPassword {
 
    String message() default "Invalid Password";
 
    Class<?>[] groups() default {};
 
    Class<? extends Payload>[] payload() default {};
 
}