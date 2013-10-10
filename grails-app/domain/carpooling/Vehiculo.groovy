package carpooling

class Vehiculo { // Clase nueva por Pau.-
	
	String patente
	String marca
	String modelo
	String color
	// Imagen de la cedula verde o azul
	Integer cantidadAsientos

    static constraints = {
		
		patente blank: false, nullable: false, unique: true
		marca blank: false, nullable: false
		modelo blank: false, nullable: false
		color blank: false, nullable: false
		cantidadAsientos blank: false, nullable: false 
		
    }
}
