package carpooling

class ViajeConductor {
	Date horaSalida
	Date diaSalida
	Integer colaboracion
	Integer asientosLibres
	String comentario

	static belongsTo = [Usuario,Ruta,Vehiculo]
	
	static constraints = {
		diaSalida  (blank: false, nullable: false)
		horaSalida  (blank: false, nullable: false)
		asientosLibres  (minSize:1)
	}
}
