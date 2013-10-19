package carpooling

class Ruta {
	
	String desde
	String hasta

    static constraints = {
		
		desde blank: false, nullable: false
		hasta blank: false, nullable: false

    }
	
	static belongsTo = Usuario
	
}
