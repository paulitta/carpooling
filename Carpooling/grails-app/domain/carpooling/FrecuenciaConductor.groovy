package carpooling



class FrecuenciaConductor {
	Date saledia
	Date salehora
	Date vuelvedia
	Date vuelvehora
	Integer lugaresdispo
	Integer colaboracion
	String comentario

	static constraints = {
		saledia blank: false, nullable: false
		salehora blank: false, nullable: false
		vuelvedia blank: false, nullable: false
		vuelvehora blank: false, nullable: false
		lugaresdispo minSize:1
	}
}
