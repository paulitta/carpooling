package carpooling



class ViajeConductor {
	
	Usuario usuario // Viaje que lo carga un usuario
	Date diaPartida
	Date horaPartida
	Vehiculo vehiculo // Composicion, aca esta el vehiculo con su cantidad de asientos
	Integer colaboracion
	String comentario

	static constraints = {
		
		diaPartida blank: false, nullable: false
		horaPartida blank: false, nullable: false
		
	}
}
