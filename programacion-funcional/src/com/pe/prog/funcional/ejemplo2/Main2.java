package com.pe.prog.funcional.ejemplo2;

import java.util.ArrayList;
import java.util.List;

import com.pe.prog.model.Persona;

public class Main2 {
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("jakie", "alarcon", 28));
		listaPersonas.add(new Persona("ana", "sanchez", 30));
		listaPersonas.add(new Persona("juan", "blanco", 20));
		
		//List<Persona> nuevoFiltro = buscarPersonaConFiltro(new FiltroPersonaNombre("jakie"), listaPersonas);
		List<Persona> nuevoFiltro = buscarPersonaConFiltro(new FiltroPersonaApellido("sanchez"), listaPersonas);
				
		for (Persona p : nuevoFiltro) {
			System.out.printf("persona: %s %s %s %n", p.getName(), p.getLastName(), p.getAge());
		}

	}
	
	
	public static List<Persona> buscarPersonaConFiltro(FiltroPersona filtro, List<Persona> listaP){
		List<Persona> personaFiltrada = new ArrayList<>();
		for (Persona persona : listaP) {
			if (filtro.test(persona)) {
				personaFiltrada.add(persona);
			}
		}
		return personaFiltrada;
	}
}
