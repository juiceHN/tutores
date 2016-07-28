//Universidad del Valle de Guatemala
//Ingenieria de Software
//Sprint 2
//Juan Carlos Tapia
//Hugo Noriega
//Rodrigo Castro
//Leonel Guillen
//Clase Usuario


public class Usuario {
	//atributos
	private String nombre, contrasena;
	//constructor
	private int id;
	public Usuario(String nombre, String contrasena, int id) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.id = id;
	
	}
	//sets y gets
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
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	
	
}
