package com.pe.prog.funcional.ejemplo4;

import com.pe.prog.model.Persona;

public class FiltroPersonaApellido implements Filtro<Persona> {

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
