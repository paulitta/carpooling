package carpooling

class ViajePasajero {
	Date horaSalida
	Integer colaboracion
	
	static belongsTo = [Usuario,Ruta]
    static constraints = {
		horaSalida ( blank: false, nullable: false)
    }
}
