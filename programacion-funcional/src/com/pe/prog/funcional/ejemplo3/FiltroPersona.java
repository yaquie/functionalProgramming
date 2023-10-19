package com.pe.prog.funcional.ejemplo3;

import com.pe.prog.model.Persona;

public interface FiltroPersona {
	public boolean test(Persona p);

	//añade una clausula or sobre el filtro que tengamos activo
	default public FiltroPersona or(FiltroPersona filtro) {
		return (Persona p) -> {return test(p) || filtro.test(p);};
	}
}
