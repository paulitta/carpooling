package carpooling

class ResultadoBusquedaController {

    def resultadoBusqueda() {
		
		
	}
	
	def renderResultadoBusquedaView =  {
		
		def desde = params.desde;
		
		render(view:"/carpooling/resultadoBusqueda")//aca se mostrarian los resultados
		//buscamos conductores(usuarios) que coincidan con la ruta ingresada.
		
	 //implementar la busqueda - crear un servicio
		
	}
}
