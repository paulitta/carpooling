package carpooling

class ViajePasajeroController {

    
	
	def renderViajePasajeroView =  {
	
		render(view:"/carpooling/busquedaDeConductores")
		
	}

	
	def buscar = {
		render(view:"/carpooling/resultadoBusqueda")//aca se mostrarian los resultados
		//buscamos conductores(usuarios) que coincidan con la ruta ingresada.
		
	 //implementar la busqueda - crear un servicio
		
		
	
	}
	
}
