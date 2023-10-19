package com.pe.prog.funcional.ejemplo1;

import java.util.ArrayList;
import java.util.List;

import com.pe.prog.model.Persona;

public class Main5 {
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("jakie", "alarcon", 28));
		listaPersonas.add(new Persona("ana", "sanchez", 30));
		listaPersonas.add(new Persona("ives", "blanco", 20));

		//primera expesion lambda sencilla, compacta
		// ya no crea la clase comparador
		 listaPersonas.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));

		for (Persona p : listaPersonas) {
			System.out.printf("persona: %s %s %s %n", p.getName(), p.getLastName(), p.getAge());
		}

	}
}
