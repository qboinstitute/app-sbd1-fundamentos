package com.qbo.interfaz;

public class DeDos implements Series {
	Integer iniciar;
	Integer valor;
	
	public DeDos() {
		iniciar = 0;
		valor = 0;
	}
	

	@Override
	public Integer getSiguiente() {
		valor += 2;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		
	}

	@Override
	public void setComenzar(Integer x) {
		iniciar = x;
		valor = x;
		
	}

}
