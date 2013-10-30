package carpooling

class BusquedaDeViajesController {

    def busquedaDeViajes() {
		
		
	}
	
	def renderBusquedaDeViajesView =  {
		
		render(view:"/carpooling/busquedaDeViajes")
		
	}
	
	def redirectResultadoBusqueda = {
		
		redirect(controller:"resultadoBusqueda", action:"renderResultadoBusquedaView")
		
	}
	
	def redirectIndex = {
		
		redirect(controller:"index", action:"renderIndexView")
		
	}
}
