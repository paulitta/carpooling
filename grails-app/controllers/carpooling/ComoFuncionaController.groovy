package carpooling

class ComoFuncionaController {

	def comoFunciona() {
	}

	def renderComoFuncionaView =  {

		render(view:"/carpooling/comoFunciona")
	}

	def redirectIndexController = {

		redirect(controller:"index", action:"renderIndexView")
		
	}

}
