package carpooling

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Ruta)
class RutaSpec extends Specification {
	void  "cuando no hay una ruta de origen no validar la ruta destino"(){
		when: 'una ruta de destino sin punto de origen'
		def ruta=new Ruta(hasta:"UNLaM")
		then:'que no sea valido'
		assert!ruta.validate()
		
		}
}
