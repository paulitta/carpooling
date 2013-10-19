package carpooling

class MiembrosComunidadController {
	
	def renderMiembrosComunidadView() {
		
		100.times {
			def listaUsuario = new Usuario(nombre: "nombre${it}", apellido: "apellido${it}", dni: 33157053 , email: "email${it}", telefono: 35282463 , contrasenia: 12345)
			listaUsuario.save()
		}
		
		def Usuarios = Usuario.list()
		
		render (view: '/carpooling/miembrosComunidad', model: [Usuarios: Usuarios])
		
	}

	
	/*def miembrosComunidad(){
		
		//def usuarios = usuarios.list()
		//render(view:"/carpooling/miembrosComunidad", model: [usuarios:usuarios])
		
		10.times {
			def tmp = new Usuario(nombre: "Usuario${it}", apellido: "Apellido${it}", dni: 123456, email: 'lalala@gmail.com', telefono: 555555, contrasenia:123)
			tmp.save()
		
		}
	}

    def renderMiembrosComunidadView =  {
		
		def usuarios = usuarios.list()
		render(view:"/carpooling/miembrosComunidad", model: [usuarios:usuarios])
		
	}
	
	def save (String nombre, String apellido, Integer dni, String email, Integer telefono, Integer contrasenia){
		
		new Usuario(params).save()
		redirect action: 'renderMiembrosComunidadView'
		//redirect action: 'miembrosComunidad'
	}*/
}

	