package com.pe.prog.funcional.ejemplo1;

import java.util.Comparator;

import com.pe.prog.model.Persona;

public class ComparadorNombre implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

}
