package carpooling

class IndexController {
	
	def index(){
		
	}

    def redirectMiembrosComunidadController = {
		
		redirect(controller:"miembrosComunidad", action:"renderMiembrosComunidadView")
		
	}
	
	def renderIndexView =  {
		
		render(view:"/carpooling/index")
		
	}
}
