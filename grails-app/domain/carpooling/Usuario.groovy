package carpooling

class Usuario {
	String nombre
	String apellido
	Integer dni
	String email
	Integer telefono
	//Imagen imagen
	String contrasenia
	Boolean conductor // En el caso que un usuario agregue un auto de forma correcta el conductor pasa a ser true.


	static hasMany = [viajes: ViajeRegistrado] // Un usuario tiene muchos viajes registrados.

	static constraints = {
		nombre (blank: false)
		apellido (blank: false, nullable: false)
		dni (blank: false, unique: true, nullable:false)
		email (blank: false ,email:true, unique: true)
		telefono (blank: false, nullable: false)
		contrasenia (blank: false, nullable:false)

	}
}
