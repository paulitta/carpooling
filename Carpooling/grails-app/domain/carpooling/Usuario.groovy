package carpooling

class Usuario {
	String nya
	Integer dni
	String email
	Integer telefono
	//Imagen imagen
	Integer contrasenia

    static constraints = {
		nya blank: false, nullable: false, unique: true
		dni blank: false, nullable: false, unique: true
		email blank: false, nullable: false, unique: true
		telefono blank: false, nullable: false
		contrasenia blank: false, nullable: false

    }
}
