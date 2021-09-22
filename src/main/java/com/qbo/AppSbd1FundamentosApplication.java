package com.qbo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qbo.model.Alumno;
import com.qbo.interfaz.*;
import com.qbo.model.Triangulo;

@SpringBootApplication
public class AppSbd1FundamentosApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(AppSbd1FundamentosApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppSbd1FundamentosApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		final String curso = "Spring Boot Developer";
		Integer edad = 30;
		Integer numero = 5;
		int precio = 10;
		String.valueOf(precio);
		String total = edad.toString() +"-"+ numero.toString();
		Double precioProducto = 13.4;
		Integer cantidadCompra = 11;		
		Double totalCompra = precioProducto *  Double.parseDouble(cantidadCompra.toString());
		//imprimirMensaje(validarLongitud("Salvatierra"));
		//buclesRepetitivos(5);
		//calcularMayor();
		Alumno objAlumno = new Alumno();
		objAlumno.setId(1);
		objAlumno.setNombre("Luis");
		objAlumno.setApellido("Salvatierra");
		Alumno objAlumno2 = new Alumno();
		objAlumno2.setId(1);
		objAlumno2.setNombre("Karla");
		objAlumno2.setApellido("Lopez");
		List<Alumno> listAlumnos = new ArrayList<Alumno>();
		listAlumnos.add(objAlumno);
		listAlumnos.add(objAlumno2);
		//imprimirAlumno(listAlumnos);
		Triangulo tri1 = new Triangulo();
		Triangulo tri2 = new Triangulo();
		tri1.setBase(4.0);
		tri1.setAltura(4.0);
		tri1.mostrarDimension();
		tri2.setBase(8.0);
		tri2.setAltura(12.0);
		//tri2.mostrarDimension();
		imprimirSeries();
		
	}
	
	private void imprimirMensaje(String mensaje) {
		LOG.info(mensaje);
	}
	
	private String longitudPalabra(String palabra1, String palabra2) {
		String palabraLarga = "";
		if(palabra1.length() > palabra2.length()) {
			palabraLarga = palabra1;
		}else if (palabra2.length() > palabra1.length()) {
			palabraLarga = palabra2;
		}else {
			palabraLarga = "Palabras iguales";
		}
		return palabraLarga;
	}
	
	private String validarLongitud(String apellido) {
		String respuesta = "";
		switch (apellido.length()) {
		case 0: respuesta = "Apellido vacío"; break;
		case 1: case 2: case 3: case 4: respuesta = "Apellido pequeño"; break;
		case 5: case 6: case 7: case 8: respuesta = "Apellido mediano"; break;
		default:
			respuesta = "Apellido es extenso";
			break;
		}
		return respuesta;
	}
	
	private void buclesRepetitivos(Integer numero) {
		Integer x = 1;
		while (x <= numero) {
			imprimirMensaje("Valor de X: " + x);
			x++;
		}
		for(int y=2; y <= numero; y++) {
			imprimirMensaje("Valor de Y: " + y);
		}
		Integer z = 1;		
		do {
			imprimirMensaje("Valor de Z: " + z);
			z++;
		} while(z < numero);
	}
	
	private void calcularMayor() {
		Integer[] marcadores = {125, 143, 234, 110};
		String[] nombres = {"Luis", "Pepe", "Maicol", "Frank"};
		Integer mayor = marcadores[0];
		for(Integer numero : marcadores) {
			if(numero > mayor) {
				mayor = numero;
			}
		}
		imprimirMensaje("El puntaje más alto es: "+ mayor);
	}
	
	private void imprimirAlumno(List<Alumno> listAlumnos) {
		for(Alumno obj : listAlumnos) {
			imprimirMensaje(obj.getNombre());
		}
	}
	
	private void imprimirSeries() {
		DeDos obj = new DeDos();
		for(int i =0; i < 5; i++) {
			LOG.info("Siguiente valor es " + obj.getSiguiente());
		}
		obj.reiniciar();
		obj.setComenzar(100);
		for(int i =0; i < 5; i++) {
			LOG.info("Siguiente valor es " + obj.getSiguiente());
		}
		
	}

}
