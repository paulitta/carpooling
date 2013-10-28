package carpooling

class Vehiculo { 
	String patente
	String marca
	String modelo
	Integer cantidadAsientos
	
	static belongsTo = [ViajeConductor,Usuario]
	static hasMany = [viajes:ViajeConductor]

	static constraints = {
		patente (blank: false, nullable: false, unique: true)
		marca   (blank: false, nullable: false)
		modelo  (blank: false, nullable: false)
		cantidadAsientos  (blank: false, nullable: false)
	}
}
