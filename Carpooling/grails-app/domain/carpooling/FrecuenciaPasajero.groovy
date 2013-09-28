package carpooling


class FrecuenciaPasajero {
	Date saledia
	Date salehora
	Date vuelvedia
	Date vuelvehora
	Integer lugaresreq
	Integer colabora
	
    static constraints = {
		saledia blank: false, nullable: false
		salehora blank: false, nullable: false
		vuelvedia blank: false, nullable: false
		vuelvehora blank: false, nullable: false
		lugaresreq minSize:1
    }
}
