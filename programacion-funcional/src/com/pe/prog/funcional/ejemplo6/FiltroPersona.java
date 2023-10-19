package com.pe.prog.funcional.ejemplo6;

import java.util.function.Predicate;

import com.pe.prog.model.Persona;

public interface FiltroPersona extends Predicate<Persona> {
	// permite pasar multiples parametros del mismo tipo
	public static Predicate<Persona> orMultiple(Predicate<Persona>... predicates) {
		Predicate<Persona> combinarPredicados = predicates[0];
		for (Predicate<Persona> predicate : predicates) {
			combinarPredicados = combinarPredicados.or(predicate);
		}
		return combinarPredicados;

	}
}
