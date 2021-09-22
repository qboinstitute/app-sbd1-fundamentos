package com.qbo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triangulo extends DosDimensiones  {

	private static Logger LOG = LoggerFactory.getLogger(Triangulo.class);
	String estilo;
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public Double are() {
		return base * altura;
	}
	
	public void mostrarEstilo() {
		LOG.info("Triángulo es: "+ estilo);
	}
	
}
