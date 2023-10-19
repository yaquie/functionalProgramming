package com.pe.prog.funcional.ejemplo5;

import java.util.function.Predicate;

import com.pe.prog.model.Persona;

public class FiltroPersonaApellido implements Predicate<Persona> {

	private String apellido;
	
	public FiltroPersonaApellido(String apellido) {
		super();
		this.apellido = apellido;
	}

	@Override
	public boolean test(Persona p) {
		return p.getLastName().equals(apellido);
	}

}
