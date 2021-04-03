package ar.edu.unju.fi.tp1pto1.model;

import org.springframework.stereotype.Component;

@Component
public class Inmueble {
	private int codigo;
	private String tipo;
	private String direccion;
	private double precio;
	private int descripcion;
	private String estado;
	private Provincia provincia;
	
	/**
	 * Constructor con parametros de la Clase Inmueble 
	 * @param codigo un valor entero
	 * @param tipo un valor String
	 * @param direccion un valor String
	 * @param precio un valor Double
	 * @param descripcion un valor int
	 * @param estado un valor String
	 * @param provincia un objeto de tipo Provincia
	 */
	public Inmueble(int codigo, String tipo, String direccion, double precio, int descripcion, String estado,
			Provincia provincia) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.direccion = direccion;
		this.precio = precio;
		this.descripcion = descripcion;
		this.estado = estado;
		this.provincia = provincia;
	}

	/**
	 * Constructor sin parametros
	 */
	public Inmueble() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
	
	
}
