package ar.edu.unju.edm.model;

public class estudiante {
	private String dni;
	private String nombre;
	private String apelllido;
	private float peso;
	private char genero;
	
	
	//constructor por defecto
	/**/
	
	public estudiante() {
		// TODO Auto-generated constructor stub
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApelllido() {
		return apelllido;
	}


	public void setApelllido(String apelllido) {
		this.apelllido = apelllido;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	

}
