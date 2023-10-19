package com.pe.prog.funcional.ejemplo5;

import java.util.function.Predicate;

import com.pe.prog.model.Persona;

public class FiltroPersonaNombre implements Predicate<Persona> {
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
