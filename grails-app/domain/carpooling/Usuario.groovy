package carpooling

class Usuario {
	
	String nombre
	String apellido
	Integer dni
	String email
	Integer telefono
	//Imagen imagen
	String contrasenia

    static constraints = {
		
		/*nombre blank: false, nullable: false
		apellido blank: false, nullable: false
		dni blank: false, nullable: false, unique: true
		email blank: false, nullable: false, unique: true
		telefono blank: false, nullable: false
		contrasenia blank: false, nullable: false*/

    }
}
