package com.pe.prog.model;

public class Persona implements Comparable<Persona> {

	private String name;
	private String lastName;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Persona(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public int compareTo(Persona otro) {
		return this.getName().compareTo(otro.getName());
	}

	//metodo de instancia
	public boolean estaJubilado() {
		return this.getAge()> 65;
	}
	
}
