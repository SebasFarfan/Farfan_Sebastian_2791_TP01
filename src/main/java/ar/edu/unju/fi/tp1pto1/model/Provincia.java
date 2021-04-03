package ar.edu.unju.fi.tp1pto1.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private int codigo;
	private String nombre;
	
	/**
	 * Constructor de la Clase Provincia 
	 * @param codigo de la ciudad
	 * @param nombre de la ciudad
	 */
	public Provincia(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	/**
	 * Constructor por defecto de la clase Provincia
	 */
	public Provincia() {
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
