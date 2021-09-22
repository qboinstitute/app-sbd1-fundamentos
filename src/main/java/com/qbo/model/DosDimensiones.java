package com.qbo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DosDimensiones {
	private static Logger LOG = LoggerFactory.getLogger(DosDimensiones.class);
	Double base;
	Double altura;
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	
	public void mostrarDimension() {
		LOG.info("La base y altura es: " + base +" " + altura);
	}
	
	

}
