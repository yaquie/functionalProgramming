package com.pe.prog.funcional.ejemplo5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.pe.prog.model.Persona;

public class MainPredicate {
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("jakie", "alarcon", 28));
		listaPersonas.add(new Persona("ana", "sanchez", 30));
		listaPersonas.add(new Persona("Mario", "blanco", 20));
		listaPersonas.add(new Persona("juan", "riveros", 71));
		listaPersonas.add(new Persona("fortunita", "reyes", 72));
		
	Predicate<Persona> filtroJakie = new FiltroPersonaNombre("jakie");
	Predicate<Persona> filtroJakieorJuan = filtroJakie.or(Persona::estaJubilado);
	
		List<Persona> nuevoFiltro = 
				buscarPersonaConFiltro(filtroJakieorJuan, listaPersonas);
				
		for (Persona p : nuevoFiltro) {
			System.out.printf("persona: %s %s %s %n", p.getName(), p.getLastName(), p.getAge());
		}

	}
	
	
	public static List<Persona> buscarPersonaConFiltro(Predicate<Persona> filtro, List<Persona> listaP){
		List<Persona> personaFiltrada = new ArrayList<>();
		for (Persona persona : listaP) {
			if (filtro.test(persona)) {
				personaFiltrada.add(persona);
			}
		}
		return personaFiltrada;
	}
}
