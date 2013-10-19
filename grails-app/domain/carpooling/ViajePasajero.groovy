package carpooling


class ViajePasajero {
	
	Date diaPartida
	Date horaPartida
	Integer lugaresRequeridos // No se si es medio al dope este atributo
	Integer colabora
	
    static constraints = {
		
		diaPartida blank: false, nullable: false
		horaPartida blank: false, nullable: false
		lugaresRequeridos minSize:1
		
    }
}
