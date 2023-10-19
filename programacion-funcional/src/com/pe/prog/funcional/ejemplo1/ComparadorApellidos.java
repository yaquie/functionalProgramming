package com.pe.prog.funcional.ejemplo1;

import java.util.Comparator;

import com.pe.prog.model.Persona;

public class ComparadorApellidos implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return p1.getLastName().compareTo(p2.getLastName());
	}

}
