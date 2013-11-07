import carpooling.Usuario

class BootStrap {

	def init = { servletContext ->

		def usuario1 = new Usuario(nombre: "Maria", apellido: "Lopez", dni: 33157053 , email: "marialopez@gmail.com", telefono: 35282463 , contrasenia: 'abc123', conductor: true)
		usuario1.save()
		
		println usuario1
		

		def usuario2 = new Usuario(nombre: "Lucia", apellido: "Roldan", dni: 29157077 , email: "luciaroldan@gmail.com", telefono: 44414566 , contrasenia: 'def456', conductor: false)
		usuario2.save()
		
		println usuario2
		

		def usuario3 = new Usuario(nombre: "Marcos", apellido: "Suarez", dni: 27100732 , email: "marcossuarez@gmail.com", telefono: 15309921 , contrasenia: 'ghi000', conductor: false)
		usuario3.save()
		
		println usuario3
		
		
	}

	def destroy = {
	}
}