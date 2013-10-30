package carpooling

class TipoUsuarioController {

    def tipoUsuario() { 
		
		
	}
	
	
	def redirectBusquedaDeViajes = {
		
		redirect(controller:"busquedaDeViajes", action:"renderBusquedaDeViajesView")
		
	}
}
