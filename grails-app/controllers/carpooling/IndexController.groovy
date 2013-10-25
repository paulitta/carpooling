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
	def renderTipoUsuarioView={
		render(view:"/carpooling/tipoUsuario") //Primera vista que ve el usuario cuando inicia sesion
	}
	def redirectViajeConductor={
		redirect(controller:"viajeConductor", action:"renderViajeConductorView")  // Donde un usuario va a publicar nuevo viaje
	}
		def redirectViajePasajeroController={
		redirect(controller:"viajePasajero", action:"renderViajePasajeroView") // Donde un usuario realiza la busqueda
    }
}
