package carpooling

class Ruta {
	String desde
	String hasta
	
	static hasMany = [busquedas:ViajePasajero,viajes:ViajeConductor]

    static constraints = {
		
		desde (blank: false, nullable: false)
		hasta (blank: false, nullable: false)
    }	
}
