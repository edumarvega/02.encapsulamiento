package ar.com.templateit.principal;

//clase Persona definido por la palabra reservada class
public class Persona {
	
	private String nombre; // declarar como privada la variable para restringir el acceso,se cumple la encapsulacion de POO
	
	//Constructor vacio, se usa cuando se instancia el objeto de tipo Persona
	// cuando se hace .... = new Persona()
	public Persona() {
		
	}
	
	// declarar los metodos getter y setter 
	// para acceder y actualizar el valor de la variable privada nombre
	// se garantiza con esto encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
}
