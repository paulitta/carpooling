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
	def renderViajeView={
		render(view:"/carpooling/publicarViaje")  // Donde un usuario va a publicar nuevo viaje
	}
	def renderBusquedaView={
		render(view:"/carpooling/busquedaDeConductores") // Donde un usuario va a realizar una nueva busqueda
	}
	
}
