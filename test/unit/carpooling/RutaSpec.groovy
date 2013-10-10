package carpooling

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Ruta)
class RutaSpec extends Specification {
	void testConstraints (){
		def existingRuta = new Ruta(desde:'Plaza de Mayo - Hipólito Yrigoyen, Buenos Aires',
		hasta: 'Florencio Varela 1903, San Justo, Buenos Aires')
		
		mockForConstraints(Ruta, [existingRuta])
		
		def ruta = new Ruta()
		
		//probando nullable:
		assert !ruta.validate()
		assert 'nullable' == ruta.errors['desde'].code
		assert 'nullable' == ruta.errors['hasta'].code
		
		//probando blank:
		ruta = new Ruta(desde:'',hasta:'')
		assert !ruta.validate()
		assert 'blank' == ruta.errors['desde'].code
		assert 'blank' == ruta.errors['hasta'].code
		
		ruta = new Ruta (desde:'Cabildo, Ciudad Madero, Buenos Aires', hasta:'Hospital Italiano de Buenos Aires, Buenos Aires')
		assert ruta.validate()
	}
}
