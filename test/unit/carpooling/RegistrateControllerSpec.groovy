package carpooling

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(RegistrateController)
class RegistrateControllerSpec extends Specification {

   def renderComoFuncionaView =  {
		
		render(view:"/carpooling/registrate")
		
	}
}
