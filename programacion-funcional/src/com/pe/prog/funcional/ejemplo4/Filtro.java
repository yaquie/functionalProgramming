package com.pe.prog.funcional.ejemplo4;

public interface Filtro<T> {
	public boolean test(T t);

	default public Filtro<T> or(Filtro<T> filtro) {
		return (T t) -> {
			return test(t) || filtro.test(t);
		};
	}
}
