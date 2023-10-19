package com.pe.prog.funcional.ejemplo3;

import com.pe.prog.model.Persona;

public class FiltroPersonaNombre implements FiltroPersona {
private String nombre;

	
	public FiltroPersonaNombre(String nombre) {
	super();
	this.nombre = nombre;
}


	@Override
	public boolean test(Persona p) {
		return p.getName().equals(nombre);
	}

}
