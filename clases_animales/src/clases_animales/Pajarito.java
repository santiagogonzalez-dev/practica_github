package clases_animales;

/**
 * @author Santiago Gonzalez
 */

public class Pajarito {
	// Atributos
	private int id;
	private String nombre;
	private String raza;
	private int edad;

	public Pajarito() {
		// Constructor vacío
	}

	public Pajarito(int id, String nombre, String raza, int edad) {
		this.id = id; // 1345232
		this.nombre = nombre; // José
		this.raza = raza; // Hornero
		this.edad = edad; // 8
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}