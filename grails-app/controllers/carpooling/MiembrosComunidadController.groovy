package carpooling

class MiembrosComunidadController {
	
	def miembrosComunidad(){
		
	}

    def renderMiembrosComunidadView =  {
		
		def usuario = Usuario.list()
		render(view:"/carpooling/miembrosComunidad", model: [usuario:usuario])
		
	}
	
	/*def save (String nombre, String apellido, Integer dni, String email, Integer telefono, Integer contrasenia){
		
		new Usuario(params).save()
		redirect action: 'renderMiembrosComunidadView'
		//redirect action: 'miembrosComunidad'
	}*/
}

	