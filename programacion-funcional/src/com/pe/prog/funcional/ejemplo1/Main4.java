package com.pe.prog.funcional.ejemplo1;

import java.util.ArrayList;
import java.util.List;

import com.pe.prog.model.Persona;

public class Main4 {
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("jakie", "alarcon", 28));
		listaPersonas.add(new Persona("ana", "sanchez", 30));
		listaPersonas.add(new Persona("ives", "blanco", 20));

		// listaPersonas.sort(new ComparadorNombre());
		//aplicando lambdas parcialmente
		listaPersonas.sort((Persona p1, Persona p2) -> {
				if (p1.getAge() == p2.getAge()) {
					return 0;
				} else if (p1.getAge() > p2.getAge()) {
					return 1;
				} else {
					return -1;
					
				}
		});

		for (Persona p : listaPersonas) {
			System.out.printf("persona: %s %s %s %n", p.getName(), p.getLastName(), p.getAge());
		}

	}
}
