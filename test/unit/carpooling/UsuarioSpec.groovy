package carpooling

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Usuario)
class UsuarioSpec extends Specification {
	void "fafsakjfhadsklfhdsa gfg,dfs g,dfsb g,.jthlqrk g.fds g,jrklewth r.gt t,.gh,l"(){
		when:
		def existingUsuario= new Usuario(nya:'Adrian Navarro', dni:18012387,email:'adriann@hotmail.com',
		telefono:44562100, contrasenia:1234)
		
		mockForConstraintsTests(Usuario, [existingUsuario])
		
		def usuario = new Usuario()
		
		//Probando nullable:
	
		then:
		!usuario.validate()
//		assert 'nullable' == usuario.errors['nya'].code
//		assert 'nullable' == usuario.errors['dni'].code
//		assert 'nullable' == usuario.errors['email'].code
//		assert 'nullable' == usuario.errors['telefono'].code
//		assert 'nullable' == usuario.errors['contrasenia'].code

		//Probando blank:
//		usuario = new Usuario(nya:'',dni:'',email:'',telefono:'',contrasenia:'')
//		assert !usuario.validate()
//		assert  'blank' == usuario.errors['nya'].code
//		assert  'blank' == usuario.errors['dni'].code
//		assert  'blank' == usuario.errors['email'].code
//		assert  'blank' == usuario.errors['telefono'].code
//		assert  'blank' == usuario.errors['contrasenia'].code

		//Probando unique:
//		usuario = new Usuario(nya:'Adrian Navarro', dni:18012387, email:'adriann@hotmail.com' )
//		assert !usuario.validate()
//		assert 'unique' == usuario.errors['nya'].code
//		assert 'unique' == usuario.errors['dni'].code
//		assert 'unique' == usuario.errors['email'].code

//		usuario = new Usuario(nya:'Maria Perez', dni:32567891, email:'mariaperez@gmail.com',
//		telefono: 1567542100, contrasenia:3433)
//		assert usuario.validate()


	}
}

