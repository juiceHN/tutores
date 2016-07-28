//Universidad del Valle de Guatemala
//Ingenieria de Software
//Sprint 2
//Juan Carlos Tapia
//Hugo Noriega
//Rodrigo Castro
//Leonel Guillen
//Clase ControladorUsuario


import java.util.ArrayList; //Se importa la libreria con la que se creara los arrays

public class ControladorUsuarios {
	private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(); //Se inicialza la lista
	private int idUsuario =0; //se inicianiliza el id de usuario
	
	public ControladorUsuarios() {
		
	}
	//Se crea la lista que contendra a los usuarios
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	//Metodo que se encargara de mostrar los usarios
	public void mostrarUsuarios(){
		if(listaUsuarios.size()!=0)
		for (int i=0;i<listaUsuarios.size();i++)//Se crea los usuarios
		{		System.out.print(listaUsuarios.get(i).getId() +". " + listaUsuarios.get(i).getNombre() + "   Clasificacion: ");//Se imprimen los tipos de empleados
				
		}
	}
	//Metodo para crear nuevo usuario
	public void nuevoUsuario (String nombre, String contraseña, int tipo){
		Usuario nuevoUs = new Usuario (nombre, contraseña, tipo, idUsuario+1);
		idUsuario++;
		listaUsuarios.add(nuevoUs);
	}

}
