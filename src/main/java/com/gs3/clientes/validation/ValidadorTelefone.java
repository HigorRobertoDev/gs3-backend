package com.gs3.clientes.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidaTelefone.class)
public @interface ValidadorTelefone {
    String message() default "Quantidade de digitos inválida para o tipo selecionado de telefone informado";
    Class<?>[] groups() default {};
    public abstract Class<? extends Payload>[] payload() default {};
}
