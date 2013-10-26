package carpooling

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Usuario)
class UsuarioSpec extends Specification {
	void  "cuando no hay un dni no validar usuario"(){
    when: 'un usuario nuevo sin dni'
	def usuario=new Usuario(nombre: "Maria", apellido: "Lopez", email: "marialopez@gmail.com", telefono: 35282463 , contrasenia: 'abc123')
	then:'que no sea valido'
	assert!usuario.validate()
	
	}

}