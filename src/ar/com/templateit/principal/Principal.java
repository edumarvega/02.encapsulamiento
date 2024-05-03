package ar.com.templateit.principal;

//Clase donde se ejecuta el programa java gracias al metodo main
public class Principal {

	// este metodo permite ejecutar un programa java
	public static void main(String[] args) {

		// se instancia un objeto de tipo Persona
		Persona persona = new Persona();

		// al objeto se setea un nombre
		persona.setNombre("lionel messi");

		// se mostrar en consola el nombre de ese objeto persona
		System.out.println("El nombre de la persona es: " + persona.getNombre());
	}

}
