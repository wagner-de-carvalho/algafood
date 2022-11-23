package com.home.algafood.core.validation;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MultiploValidator implements ConstraintValidator<Multiplo, Number> {
	private int numeroMultiplo;

	@Override
	public void initialize(Multiplo constraintAnnotation) {
		this.numeroMultiplo = constraintAnnotation.numero();
	}

	@Override
	public boolean isValid(Number value, ConstraintValidatorContext context) {
		boolean valido = true;

		if (value != null) {
			var valorDecimal = BigDecimal.valueOf(value.doubleValue());
			var multiplpDecimal = BigDecimal.valueOf(this.numeroMultiplo);
			var resto = valorDecimal.remainder(multiplpDecimal);
			valido = BigDecimal.ZERO.compareTo(resto) == 0;
		}
		return valido;
	}

}
